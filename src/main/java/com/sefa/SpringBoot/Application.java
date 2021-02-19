package com.sefa.SpringBoot;

import com.sefa.SpringBoot.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
//Makes this class to server rest-endpoints
@RestController
public class Application {

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);
	}

	@GetMapping()
	public List<Student> hello(){
		return List.of(new Student(1,
				"John",
				21,
				"john@gmail.com",
				LocalDate.of(2000, Month.APRIL,21))
		);
	}

}
