package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.College;
import com.example.demo.Entity.Professor;
import com.example.demo.Entity.Student;
import com.example.demo.Repository.RepositoryCollege;
import com.example.demo.Repository.RepositoryProfesser;
import com.example.demo.Repository.RepositoryStudent;

@Service
public class TaskService {

	public static final String GET_ID_STUDENT="select  s_Id from Student";
	public static final String GET_ID_PROFESSOR="select student_s_id from professor";
	public static final String GET_ID_COLLEGE="select professor_id from college";
	
	@Autowired
	private JdbcTemplate jdbc;
	
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
		 professer.findAll();
		 for(int i=0;i<prof.size();i++) {
			 for(int j=0;j<GET_ID_STUDENT.length();j++) {
				 if(i==j) {
					 continue;
				 }
				 else {
					 break;
				 }
			 }
		 }
		 
		 return prof;
	}
	public College saveAll(College coll) {
		return college.save(coll);
	}
	public List<College> findAllCollege() {
//		List<College> coll= new ArrayList<>();
//		 college.findAll().forEach(coll::add);
		 return (List<College>)college.findAll();
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
