package com.sefa.SpringBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//this class will have all resources for our API
@RestController

//localhost:8080/api/v1/student
@RequestMapping(path = "api/v1/student")
public class StudentController {

    private final StudentService studentService;

    //Autowired: We say that StudentService instance should
    // autowired for studentService in constructore parameter.
    // It enables you to inject the object dependency implicitly.
    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudents(){
        return studentService.getStudents();
    }
}
