package com.example.springmvc.controller;

import com.example.springmvc.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProductController {

    @RequestMapping(path="/")
    public String index(){
        return "index";
    }

    @RequestMapping(path="/products/add" , method= RequestMethod.GET)
    public String CreateProduct(Model model){
        model.addAttribute("product",new Product());
    }
}
