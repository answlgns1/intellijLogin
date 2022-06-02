package com.jjorsae.login.Controller;


import com.jjorsae.login.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

@RequestMapping("/jjorsae/**")
@RequiredArgsConstructor

public class logincontroller {

    private final BoardService service;

    @GetMapping("hello")
    public String Hello(){
        return "hello";
    }

    @GetMapping("/test")
    public String test(Model model){
        model.addAttribute("cnt",service.boardCount());
        model.addAttribute("test",service.boardList());

        return "hello";
    }


}
