package com.master.controller;

import com.master.domain.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
@Controller
@RequestMapping("/iteration")
public class IterationController {

    @RequestMapping("/basic")
    public String basic(Model model) {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            products.add(new Product(i, "product" + i, new BigDecimal(i), true));
        model.addAttribute("products", products);
        return "iteration/basic";
    }
}
