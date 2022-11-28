package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.ExcelEntity;

public interface ExcelRepository extends JpaRepository<ExcelEntity, Integer> {

}
