package com.example.spring.batch.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {

    @Id
    int id;
    String name;
    String dept;
    String salary;

}
