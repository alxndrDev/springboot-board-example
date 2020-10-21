package com.example.board.domain.board;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
public interface BoardRepository extends JpaRepository<Board, Long> {

}
