package com.example.studentmgt.service;

import com.example.studentmgt.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
}
