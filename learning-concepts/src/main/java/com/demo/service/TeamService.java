package com.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.model.Team;
import com.demo.repo.TeamRepository;



@Component
public class TeamService {
	
	@Autowired
	private TeamRepository repo;
	
	public Team getDetails(String team) {
		
		Optional<Team> t1=repo.findById(team);
	//if(team!=null)
	return	repo.findById(team).orElse(new Team());
		
		
	}
	
	public void update(Team team) {
		repo.save(team);
		
		
	}
	
	public List<Team> teams() {
		return repo.findAll();
	}

}
