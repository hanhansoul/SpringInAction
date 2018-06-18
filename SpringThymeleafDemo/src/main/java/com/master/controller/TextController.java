package com.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/17 0017.
 */
@Controller
public class TextController {
    @RequestMapping("/textExample")
    public String textExample(Model model) {
        model.addAttribute("today", new Date());
        return "text_examples/text_display";
    }
}
