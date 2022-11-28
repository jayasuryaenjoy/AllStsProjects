package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.College;
import com.example.demo.Entity.Professor;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.RepositoryCollege;
import com.example.demo.Repository.RepositoryProfesser;
import com.example.demo.Repository.RepositoryStudent;

@Service
public class TaskService {

	@Autowired
	private RepositoryCollege college;
	@Autowired
	private RepositoryProfesser professer;
	@Autowired
	private RepositoryStudent student;
	
	public Professor saveAll(Professor prof) {
		return professer.save(prof);
	}
	public List<Professor> findAllProfessor() {
		List<Professor> prof= new ArrayList<>();
		 professer.findAll().forEach(prof::add);
		 return prof;
	}
	public College saveAll(College coll) {
		return college.save(coll);
	}
	public List<College> findAllCollege() {
		List<College> coll= new ArrayList<>();
		 college.findAll().forEach(coll::add);
		 return coll;
	}
	
	public Student saveAll(Student stu) {
		return student.save(stu);
	}
	public List<Student> findAll() {
		List<Student> stu= new ArrayList<>();
		 student.findAll().forEach(stu::add);
		 return stu;
	}
}
