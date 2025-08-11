package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @GetMapping("greet")
    public String greet() {
        return "Hello Deploy";
    }

    @GetMapping("bye")
    public String goodBye() {
        return "Goodbye Deploy";
    }
}
