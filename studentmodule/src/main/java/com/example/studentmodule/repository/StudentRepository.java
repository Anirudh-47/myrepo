package com.example.studentmodule.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.studentmodule.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
    Student findByHallTicketNo(Long hallTicketNo);

	
}

