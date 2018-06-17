package com.master.controller;

import com.master.domain.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model) {
        Msg msg = new Msg("test title", "test content", "test info");
        model.addAttribute("msg", msg);
        return "home";
    }

    @RequestMapping("/test")
    public String login() {
        System.out.println("test");
        return "test";
    }

//    @RequestMapping("/login")
//    public String login() {
//        return "login";
//    }
}
