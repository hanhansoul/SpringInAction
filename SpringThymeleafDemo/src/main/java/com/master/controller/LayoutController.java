package com.master.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
@Controller
@RequestMapping("/layout")
public class LayoutController {
    @RequestMapping("/index")
    public String index() {
        return "layout/index";
    }
}
