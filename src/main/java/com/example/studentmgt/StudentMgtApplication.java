package com.example.studentmgt;

import com.example.studentmgt.entity.Student;
import com.example.studentmgt.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentMgtApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StudentMgtApplication.class, args);
    }

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("wycliffe", "mwimali", "mwimali@gmail.com");
//        studentRepository.save(student1);

    }
}
