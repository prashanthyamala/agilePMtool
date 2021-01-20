package com.agileFlow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.agileFlow.services.ProjectService;

import domain.Project;

@RestController
@RequestMapping("/api/project")
public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> newProject (@RequestBody Project project){
		Project project1 = projectService.saveOrUpdate(project);
		return new ResponseEntity<Project>(project1, HttpStatus.CREATED);
	}
	
}
