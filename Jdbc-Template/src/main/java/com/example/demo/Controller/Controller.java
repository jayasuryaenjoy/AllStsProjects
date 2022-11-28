package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Entity_Class;
import com.example.demo.Repository.JdbcRep;

@RestController
public class Controller {
	@Autowired
	private JdbcRep jdbcrep;
	@PostMapping("/SaveEntityClass")
	public Entity_Class saveEmployee(@RequestBody Entity_Class entity) {
		return jdbcrep.saveEntityClass(entity);
	}
	@PutMapping("/UpdateEntityClass")
	public Entity_Class updateEmployee(@RequestBody Entity_Class entity) {
		return jdbcrep.updateEntityClass(entity);
	}
	@GetMapping("/GetEntityClass")
	public Entity_Class getEmployeeById(@RequestBody Entity_Class entity ) {

		return jdbcrep.getById(entity);
	}
	@DeleteMapping("/DeleteById")
	public Entity_Class deleteById(@RequestBody Entity_Class entity) {
		return jdbcrep.deleteById(entity);
	}
	@GetMapping("/ALLRecordes")
	public List<Entity_Class> allEmployees() {
		return jdbcrep.allEntityClasss();
	}
}
