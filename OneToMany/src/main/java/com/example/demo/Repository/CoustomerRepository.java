package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Coustomer;

public interface CoustomerRepository extends JpaRepository<Coustomer, Integer> {

}
