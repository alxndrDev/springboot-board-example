package com.example.board.domain.board;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * @author Alexander
 * @date 2020-10-21
 **/
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardReqDto {

    @Length(min = 5, message = "20자이상 입력해주시기 바랍니다.")
    @NotNull
    private String title;

    @Length(min = 20, message = "50자 이상 입력해주시기 바랍니다.")
    @NotNull
    private String content;
}
