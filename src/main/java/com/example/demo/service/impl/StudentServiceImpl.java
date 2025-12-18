package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
import java.util.List;
import java.util.Optional;

import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
@Autowired
    StudentRepository stdrepo;
  @Override
    public Student poststudent(Student st){
        return stdrepo.save(st);
    }
    @Override
    public List<Student> getAllStudent(){
        return stdrepo.findAll();
    }
    @Override
     public Optional<Student> getById(Long id){
          return stdrepo.findById(id);
    }
    @Override
    public String updateData(Long id,Student st){
        boolean Status=stdrepo.existById(id);
        if(Status){
            
        }
    }

}