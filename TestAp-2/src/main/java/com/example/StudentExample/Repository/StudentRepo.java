package com.example.StudentExample.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentExample.Entity.StudentEntity;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer>{

}
