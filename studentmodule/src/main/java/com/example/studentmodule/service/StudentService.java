package com.example.studentmodule.service;

import com.example.studentmodule.entity.Student;
import com.example.studentmodule.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    // CREATE or UPDATE
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    // READ ALL
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ ONE BY ID
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    // DELETE
    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student deleted successfully with id: " + id;
    }
}
