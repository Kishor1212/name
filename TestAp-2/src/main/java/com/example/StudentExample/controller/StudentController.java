package com.example.StudentExample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.services.StudentService;

@RestController
public class StudentController {
	
	@Autowired(required=true)
	StudentService stuServices;
	@PostMapping("/addDetails")
	public StudentEntity addInfo(@RequestBody StudentEntity st) {
		return stuServices.saveDetails(st);
	}
	@GetMapping("showDetails")
	public List<StudentEntity> fetchDetails()
	{
		return stuServices.getDetails();
	}
	@PutMapping("/updateDetails")
	public StudentEntity updateInfo(@RequestBody StudentEntity st1)
	{
		return stuServices.updateDetails(st1);
	}
}
