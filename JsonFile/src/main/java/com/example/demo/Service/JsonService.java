package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.JavaTeam;
import com.example.demo.Repository.JsonRepository;

@Service
public class JsonService {

	@Autowired
	private JsonRepository repository;

	public Iterable<JavaTeam> list() {
		return repository.findAll();
	}

	public JavaTeam save(JavaTeam team) {
		return repository.save(team);
	}

	public void save(List<JavaTeam> team) {
		repository.saveAll(team);
	}

}
