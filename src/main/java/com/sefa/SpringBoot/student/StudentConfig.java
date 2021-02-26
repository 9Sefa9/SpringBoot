package com.sefa.SpringBoot.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

//A configuration file
@Configuration
public class StudentConfig {

    /*
    a simple Spring Boot interface with a run method.
    Spring Boot will automatically call the run method of all beans
    implementing this interface after the application context has been loaded.
     */
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam = new Student(
                    "Mariam",
                    21,
                    "mariam.jamal@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 5)
            );


            Student john = new Student(
                    "John",
                    21,
                    "john.jack@gmail.com",
                    LocalDate.of(1998, Month.APRIL, 11)
            );

            studentRepository.saveAll(List.of(mariam,john));
        };
    }
}
