package com.sefa.SpringBoot.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//ID for Student is a long

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


}
