package com.atsoft.student_service;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class StudentController {
    @GetMapping("/test")
    String testApi(){
        return "Hello from student service instance 2";
    }
}
