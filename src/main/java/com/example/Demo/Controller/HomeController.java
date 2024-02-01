package com.example.Demo.Controller;

import java.util.List;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Demo.entity.Student;
import com.example.Demo.repository.StudentRepository;

@RestController
public class HomeController {
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/")
	public String index() {
		return "Welcome To Spring Boot Crud Application!!!";
		
		
	}
	//Handler for creating new record in DB
	@PostMapping("/saveStudent")
	public Student saveData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
	}
	//Handler for fetch a single record
	@GetMapping("/getStudent/{rollno}")
	public Student getStudentData(@PathVariable int rollno) {
		Optional<Student> student = studentRepository.findById(rollno);
		Student student1= student.get();
		return student1;
	}
	//Handler for fetch all data from DB
	@GetMapping("/getAllStudent")
	public List<Student> getAll(){
		List<Student> studentList = studentRepository.findAll();
		return studentList;
	}
	
	//Handler for delete a particular record from DB
	@DeleteMapping("/DeleteStudent/{rollno}")
	public String deleteStudent(@PathVariable int rollno ) {
		Student student = studentRepository.findById(rollno).get();
		if (student!=null)
			studentRepository.delete(student);
		return "Deleted Successfully!!";
		}
	
	//Handler for updating a particular record
	@PutMapping("/updateData")
	public Student updateStudentData(@RequestBody Student student) {
		studentRepository.save(student);
		return student;
		
	}
}