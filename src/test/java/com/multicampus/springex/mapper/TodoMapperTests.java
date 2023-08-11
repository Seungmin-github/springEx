package com.multicampus.springex.mapper;

import com.multicampus.springex.domain.TodoVO;
import com.multicampus.springex.dto.PageRequestDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;


@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTests {
    @Autowired(required = false)
    private TodoMapper todoMapper;


    @Test
    public void testGetTime(){
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert(){
        TodoVO todoVO = TodoVO.builder()
                .title("스프링 TodoTest")
                .dueDate(LocalDate.of(2023,8,9))
                .writer("user1")
        .build();
        todoMapper.insert(todoVO);

    }

    @Test
    public void testSelectAll(){
        List<TodoVO> voList = todoMapper.selectAll();
        voList.forEach(vo -> log.info(vo));

      /*  for(TodoVO vo : voList) {
            log.info(vo);            //위의 람다식과 같은 의미
        }*/
    }

    @Test
    public void testSelectOne() {
        TodoVO todoVO = todoMapper.selectOne(3L); //Long값이라L붙여줌
        log.info(todoVO);
    }

    @Test
    public void testSelectList() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(3)
                .size(10)
                .build();
        List<TodoVO> voList = todoMapper.selectList(pageRequestDTO);
        voList.forEach(vo -> log.info(vo));
    }
}
//4.테스트코드 개발
