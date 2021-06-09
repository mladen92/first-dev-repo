package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    static int a;
    int b;

    @RequestMapping     // it is ("/") slash by default
    public String getRequestMapping() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/app")
    public String getRequestMapping2() {
        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/app")
    public String getRequestMapping3() {
        return "home";
    }

    @RequestMapping("/school")
    public String getRequestMapping4() {
        return "home";
    }

    @GetMapping("/spring")
    public String getMappingEx() {
        return "home";
    }

    @PostMapping("/spring")
    public String getMappingEx2() {
        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableExample(@PathVariable("name") String name) {
        System.out.println("Name is: " + name);
        return "home";
    }

    @GetMapping("/home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("Course is: " + course);
        return "home";
    }

    @GetMapping("/course")
    public String requestParamEx2(@RequestParam(value = "course", required = false, defaultValue = "School") String course) {
        System.out.println("Course is: " + course);
        return "home";
    }
}
