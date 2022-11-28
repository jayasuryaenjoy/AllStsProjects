package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.Entity_Class;

public interface JdbcRep {

	Entity_Class saveEntityClass(Entity_Class entityclass);

	Entity_Class updateEntityClass(Entity_Class entityclass);

	Entity_Class getById(Entity_Class entityclass);

//	String deleteById(int id);

	List<Entity_Class> allEntityClasss();

	Entity_Class deleteById(Entity_Class entityclass);

}
