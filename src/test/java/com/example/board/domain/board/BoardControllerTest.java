package com.example.board.domain.board;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
class BoardControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void 뷰테스트() throws Exception {
        mockMvc.perform(get("/board"))
                .andExpect(status().isOk())
                .andExpect(view().name("/board/create"));

    }

    @Test
    public void 글생성테스트() throws Exception {
        mockMvc.perform(post("/board")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("title", "테스트중입니다.")
                .param("content", "안녕하세요 반갑습니다글쓰기 테스트입니다.")
            )
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/board/1"));
    }

}