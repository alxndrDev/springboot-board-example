package com.example.board.domain.board;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@Controller
@RequestMapping("/board")
public class BoardController {

    @GetMapping
    public String createView() {
        return "/board/create";
    }
    @PostMapping
    public ResponseEntity create(Board board) {



        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
