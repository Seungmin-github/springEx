package com.multicampus.springex.dto;

import lombok.*;


import java.time.LocalDate;

@ToString
@Data //setter getter 처리해줌
@Builder
@AllArgsConstructor  //모든 속성에 대한 아규먼트 받아서
@NoArgsConstructor //Default 생성자
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
    private String writer;
}
