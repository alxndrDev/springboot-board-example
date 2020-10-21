package com.example.board.domain.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping
    public String createView(BoardReqDto boardReqDto) {
        return "/board/create";
    }


    @PostMapping
    public String create(@Valid BoardReqDto boardReqDto, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/board/create";
        }



        return "redirect:/board";
    }

}
