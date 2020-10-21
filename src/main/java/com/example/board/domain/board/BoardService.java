package com.example.board.domain.board;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public Long createBoard(BoardReqDto boardReqDto) {

        Board board = Board.builder()
                .title(boardReqDto.getTitle())
                .content(boardReqDto.getContent())
                .build();

        Board newBoard = boardRepository.save(board);

        return newBoard.getId();
    }

}
