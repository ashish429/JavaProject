package com.example.mini.java.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.mini.java.assignment.model.Entity;
import com.example.mini.java.assignment.repository.EntityRepository;
public class EntityService {

	@Autowired
	private EntityRepository entityRepository;

	public List<Entity> AllTransaction() {
		List<Entity> entityList = (List<Entity>) entityRepository.findAll();
		return entityList;
	}

	public List<Entity> searchEntity(String query) {
		List<Entity> entityList = entityRepository.searchTransaction(query);
		return entityList;
	}
}
