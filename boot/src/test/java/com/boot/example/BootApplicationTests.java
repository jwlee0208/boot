package com.boot.example;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.boot.example.dto.BoardDto;
import com.boot.example.dto.UserDto;
import com.boot.example.service.BoardService;
import com.boot.example.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
class BootApplicationTests {

	@Autowired
    private UserService uService;
    @Autowired
    private BoardService bService;
 
    @Test
    public void boardTest() {
        BoardDto board = new BoardDto();
        board.setPassword("1234");
        board.setWriter("test");
        bService.write(board);
        
        for (BoardDto b : bService.getBoardList())
            System.out.println(b);
    }
    
    @Test
    public void userTest() {
        UserDto user = new UserDto();
        user.setUserId("test2");
        user.setUserPw("test2");
        user.setUserName("테스트2");
        user.setUserGender("남");
        user.setUserEmail("test@test.test");
        uService.join(user);
        System.out.println(uService.getUser("test2"));
        System.out.println("로그인 결과 : " + uService.login("test2", "test2"));
    }

}
