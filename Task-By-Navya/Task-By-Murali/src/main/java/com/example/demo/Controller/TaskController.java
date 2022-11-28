package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.College;
import com.example.demo.Entity.Professor;
import com.example.demo.Entity.Student;
import com.example.demo.Service.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService service;

	@PostMapping("/college")
	public College addCollege(@RequestBody College college) {
		return service.saveAll(college);
	}

	@PostMapping("/professor")
	public Professor addProfessor(@RequestBody Professor professor) {
		return service.saveAll(professor);
	}

	@PostMapping("/student")
	public Student addstudent(@RequestBody Student student) {
		return service.saveAll(student);
	}
	@GetMapping("/getcollege")
	public List<College> findAllCollegeInFo() {
		return service.findAllCollege();
	}

	@GetMapping("/getprofessor")
	public List<Professor> findallProfessor() {
		return service.findAllProfessor();
	}

	@GetMapping("/getstudent")
	public List<Student> findallStudents() {
		return service.findAll();
	}
}
