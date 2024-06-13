package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.domain.User;
import com.example.service.MyPageService;

@Controller
@RequestMapping("/mypage")
public class MyPageController {

    @Autowired
    MyPageService myPageService;

    @GetMapping("")
    public String myPageController(Model model, @RequestParam(name = "id", defaultValue = "") String id) {
        
        id = "1001";
        User user = myPageService.showToMyPage(id);
        model.addAttribute("user", user);
        System.out.println(user);

        return "mypage";
    }
}
