package com.example.demo.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;

@Service
public class StudentService {
	
	ArrayList<Student> std=new ArrayList<>();



public ArrayList<Student> saveStudent(Student student) {
	 std.add(student);
	return std;
}

public ArrayList<Student> findAllStudent(){
	if(std.isEmpty()) {
		return new ArrayList<Student>();
	}
	return std;
	
	
}

public Student getStudentById(int id){

	for(int i=0;i<std.size();i++) {
		if(std.get(i).getId()==id) {
			return std.get(i);
		}
	}
	return null;
	
}

public Student deletedById(int id) {
	for(int i=0;i<std.size();i++) {
		if(std.get(i).getId()==id) {
			return std.remove(i);
		}
	}
	return null;
}

public ArrayList<Student> updateStudent(int id,Student student){
	
	for(int i=0;i<std.size();i++) {
		if(std.get(i).getId()==id) {
			std.set(i, student);
			return std;
		}
	}
	return null;
}

}
