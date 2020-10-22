package com.example.board.domain.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@Controller
@RequestMapping("/board")
@RequiredArgsConstructor
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public String createView(BoardReqDto boardReqDto) {
        return "/board/create";
    }


    @PostMapping
    public String create(@Valid BoardReqDto boardReqDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/board/create";
        }

        Long newId = boardService.createBoard(boardReqDto);

        return "redirect:/board/" + newId;
    }

}
