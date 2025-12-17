package com.example.demo.service;



import com.example.demo.entity.Student;

public interface StudentService{
     Student poststudent(Student st);
    
     public List<student> getAllStudent(){
        return new ArrayList<>(details.values());
    }

}