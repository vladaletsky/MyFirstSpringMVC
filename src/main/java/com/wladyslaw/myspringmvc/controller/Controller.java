package com.wladyslaw.myspringmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/welcome")
    public String helloWithRequestParam(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }

    @PostMapping("/addName")
    public String addName(@RequestBody String userName) {
        System.out.println(userName);
        return "hello";
    }

}
