package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRe

@Service
public class StudentServiceImpl impliments StudentService{
    @Autowired
    StudentRepository stdrepo;
  @Override
    public Student poststudent(Student st){
        
    }

}