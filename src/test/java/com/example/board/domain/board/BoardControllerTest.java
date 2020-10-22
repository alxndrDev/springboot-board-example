package com.example.board.domain.board;

import com.example.board.BoardApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * @author Alexander
 * @date 2020-10-21
 **/

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
    public void create() throws Exception {
        mockMvc.perform(post("/board")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("title", "테스트중입니다.")
                .param("content", "안녕하세요 반갑습니다글쓰기 테스트입니다.")
            )
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/board/1"));
    }

}