package com.example.mini.java.assignment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.java.assignment.model.Entity;
import com.example.mini.java.assignment.repository.EntityRepository;

@CrossOrigin(origins = "http://localhost:8087")
@RestController
@RequestMapping("/transaction/")
public class TransactionController {

	@Autowired
	private EntityRepository entityRepository;

	// get all Transaction detail with account number
	@GetMapping("/ALL")
	public List<Entity> getAllProducts() {
		return entityRepository.findAll();
	}
}