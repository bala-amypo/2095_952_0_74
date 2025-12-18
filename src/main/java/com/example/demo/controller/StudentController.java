package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.example.demo.entity.Student;
import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
  @Autowired
  StudentService stdser;

  @PostMapping("/addStudent")
  public Student addStudent(@RequestBody Student st){
    return stdser.poststudent(st);
  }
  @GetMapping("/getAll")
  public List<Student> get(){
    return stdser.getAllStudent();
  }
  @GetMapping("/GetById/{id}")
  public Optional<Student> getById(@PathVariable Long id){
     return stdser.getById(id);
  }
  @PutMapping("/Update/{id}")
  public String updateData(@PathVariable Long id,@RequestBody Student st){
    return stdser.updateData(id,st);
  }
     @DeleteMapping("/delete/{id}")
     public String delete(@PathVariable Long id){
      return stdser.deleteData(id);
     }
}