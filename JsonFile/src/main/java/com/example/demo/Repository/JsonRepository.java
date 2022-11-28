package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.JavaTeam;

@Repository
public interface JsonRepository extends JpaRepository<JavaTeam, Integer> {

}
