package com.example.StudentExample.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Repository.StudentRepo;

public class StudentService
	{

		@Autowired(required=true)
		StudentRepo stRepo;
		
		public StudentEntity saveDetails(StudentEntity e)
		{
			return stRepo.save(e);
		}
		public List<StudentEntity> getDetails()
		{
			return stRepo.findAll();
		}
		public StudentEntity updateDetails(StudentEntity e1)
		{
			return stRepo.saveAndFlush(e1);
		}


      }
