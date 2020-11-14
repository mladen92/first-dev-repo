package com.app.app.controller;

import com.app.app.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

    @GetMapping("/welcome")
    public String homePage(Model model){
        String name = "John";
        String course = "Java";
        int studentId = 27;
        model.addAttribute("name", name);
        model.addAttribute("course", course);
        model.addAttribute("ids", studentId);

        Student student = new Student(1, "Mike", "Smith");
        model.addAttribute("student", student);




        return "student/welcome";
    }
}
