package com.agileFlow.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import domain.Project;

@Repository
public interface ProjectRepos extends CrudRepository<Project, Long> {

	@Override
	default Iterable<Project> findAllById(Iterable<Long> iterable) {
		// TODO Auto-generated method stub
		return null;
	}
	
	 

}
