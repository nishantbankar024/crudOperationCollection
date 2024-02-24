package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentService studentService;
	
	@PostMapping("/")
	public ArrayList<Student> saveStudent(@RequestBody Student student) {
		return this.studentService.saveStudent(student);
	}

	@GetMapping("/")
	public ArrayList<Student> getAllData(){
		return this.studentService.findAllStudent();
	}
	@GetMapping("/{id}")
	public Student getByIdStudent(@PathVariable int id) {
		return this.studentService.getStudentById(id);
	}
	
	@DeleteMapping("/{id}")
	public Student deletedById(@PathVariable int id) {
		return this.studentService.deletedById(id);
	}
	
	@PutMapping("/{id}")
	public ArrayList<Student> updatestudent(@PathVariable int id, @RequestBody Student student) {
		return this.studentService.updateStudent(id, student);
	}
}
