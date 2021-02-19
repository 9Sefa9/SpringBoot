package com.sefa.SpringBoot.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {


    public List<Student> getStudents(){
        return List.of(new Student(1,
                "John",
                21,
                "john@gmail.com",
                LocalDate.of(2000, Month.APRIL,21))
        );
    }
}
