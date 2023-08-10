package com.multicampus.springex.dto;

import lombok.*;


import javax.validation.constraints.Future;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

@ToString
@Data //setter getter 처리해줌
@Builder
@AllArgsConstructor  //모든 속성에 대한 아규먼트 받아서
@NoArgsConstructor //Default 생성자
public class TodoDTO {
    private Long tno;
    @NotEmpty  //빈 문자열, NULL 불가
    private String title;

    @Future  //현재보다 미래인가?  //past 현재보다 과거인가?
    private LocalDate dueDate;
    private boolean finished;

    @NotEmpty
    private String writer;
}
