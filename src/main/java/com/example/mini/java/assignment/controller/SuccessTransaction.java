package com.example.mini.java.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mini.java.assignment.model.Entity;
import com.example.mini.java.assignment.service.EntityService;
@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/backendserver1/")
public class SuccessTransaction {
	@Autowired
    private EntityService entitySearch;

	 // Search status Rest API
    @RequestMapping(value = "/accountNumber/{success}", method = RequestMethod.GET)
    public ResponseEntity<List<Entity>> searchEntity(@PathVariable("{success}") String success) {
        return ResponseEntity.ok(entitySearch.searchEntity(success));
    }
}
