package com.example.lishifeng.code.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author lishifeng  2019-04-25
 */
@Controller
public class HelloControlller {
    @GetMapping("/hello")
    public  String  hello(@RequestParam(name = "name") String name, Model model){
        model.addAttribute("name",name);
//      返回字符串，将会在templates模板中寻找同名的文件
        return  "hello";

    }
}
