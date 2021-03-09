package com.wladyslaw.myspringmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/path/{id}")
    public String helloWithPath(@PathVariable String id){
        System.out.println(id);
        return "hello";
    }

    @PostMapping("/addName")
    public String addName(@RequestBody String userName) {
        System.out.println(userName);
        return "hello";
    }

    @PostMapping("/json")
    @ResponseBody
    public String sendJson(@RequestBody String name){
        System.out.println(name);
        return "hello";
    }


}
