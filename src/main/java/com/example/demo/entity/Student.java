package com.example.demo.entity;

import java.time.LocalDate;

public class Student{
        private Long id;
        private String name;
        private String dept;
        private LocalDate dob;
        private float cgpa;

        public Long getId(){
                return id;
        }
        public void setId(Long id){
                this.id=id;
        }
         public String getName(){
                return name;
        }
        public void setName(String name){
                this.name=name;
        }
         public String  getdept(){
                return dept;
        }
        public void setdept(String dept){
                this.dept=dept;
        }
         public LocalDate getdob(){
                return dob;
        }
        public void setdob(LocalDate dob){
                this.dob=dob;
        }
         public float getcgpa(){
                return cgpa;
        }
        public void setcgpa(float cgpa){
                this.cgpa=cgpa;
        }
       
}