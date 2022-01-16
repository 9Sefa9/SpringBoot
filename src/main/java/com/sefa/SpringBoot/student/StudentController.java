package com.sefa.SpringBoot.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    //Otherwise, the "this.studentService" would be null since it has to be instantiated.
    
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

    //we can grab the studentID by annotating with @PathVariable
    // so http://localhost:8080/api/v1/student/1  the number 1 will be captured to studentId parameter in deleteStudent
    @DeleteMapping(path = "{studentID}")
    public void deleteStudent(@PathVariable("studentID") Long studentId) {
        studentService.deleteStudent(studentId);
    }

    //requestparameter => both are not required
    @PutMapping(path = "{studentId}")
    public void updateStudent(
            @PathVariable("studentId") long studentId,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String email) {

        studentService.updateStudent(studentId,name,email);
    }

}
