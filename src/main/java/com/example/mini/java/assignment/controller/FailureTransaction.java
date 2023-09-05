package com.example.mini.java.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.mini.java.assignment.model.Entity;
import com.example.mini.java.assignment.service.EntityService;

public class FailureTransaction {
	@Autowired
    private EntityService entitySearch;

	 // Search status Rest API
    @RequestMapping(value = "/accountNumber/{failure}", method = RequestMethod.GET)
    public ResponseEntity<List<Entity>> searchEntity(@PathVariable("{failure}") String failure) {
        return ResponseEntity.ok(entitySearch.searchEntity(failure));
    }
}
