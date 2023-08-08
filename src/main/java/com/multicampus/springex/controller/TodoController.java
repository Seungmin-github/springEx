package com.multicampus.springex.controller;

import com.multicampus.springex.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
@Log4j2
public class TodoController {
    @RequestMapping("/list")     // todo/list를 의미
    public void list() {
        log.info("todo_list .....");
    }

    //@RequestMapping(value= "/register, method = RequestMethod.GET")     // todo/register를 의미
    @GetMapping("/register")
    public void register() {
        log.info("Get todo_register .....");
    }

    @PostMapping("/register")
    public void registerPost(TodoDTO todoDTO) {
        log.info("Post todo register.....");
        log.info(todoDTO);
    }


}
