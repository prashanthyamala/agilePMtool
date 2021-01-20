package com.agileFlow.services;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.agileFlow.repositories.ProjectRepos;

import domain.Project;

@Service 
public class ProjectService {
	@Autowired
	private ProjectRepos projectRepos;
	
	
	public Project saveOrUpdate ( Project project) {
		return projectRepos.save(project);
	}
	

}
