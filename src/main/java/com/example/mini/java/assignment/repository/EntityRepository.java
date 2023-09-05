package com.example.mini.java.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.mini.java.assignment.model.Entity;

public interface EntityRepository extends JpaRepository<Entity, Integer> {
	@Query(value = "select * from entity where " + " status like %:query% ", nativeQuery = true)

	List<Entity> searchTransaction(String query);
}