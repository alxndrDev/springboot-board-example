package com.example.board;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@RestController
@RequestMapping("")
public class IndexController {

    @GetMapping("hello")
    public String hello() {
        return "Hello Stranger";
    }

}
