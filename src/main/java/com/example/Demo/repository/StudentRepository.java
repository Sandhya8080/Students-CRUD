package com.example.Demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.Demo.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

}
