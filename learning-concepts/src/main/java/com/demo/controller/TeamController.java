package com.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.Team;
import com.demo.service.TeamService;

@RestController
@RequestMapping("/")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@GetMapping("/")
	public String welcome(@RequestParam(value="name", defaultValue = "TB") String name) {
		return "Hi Ayra Rangala :)";
	}
	
	@GetMapping("/family")
	public String family(@RequestParam(value="name", defaultValue = "TB") String name) {
		return "Bhavani Kambham"
				+ "Nagarjun Rangala";
	}
	
	@GetMapping("/get")
	public Team getDetails(@RequestParam(value="name", defaultValue = "TB") String name) {
		return teamService.getDetails("TB");
	}
	
	@GetMapping("/getall")
	public List<Team> getTeams(){
		return teamService.teams();
	}
	
	@GetMapping("/save")
	public void insert() {
		Team team=new Team();
		team.setName("TB");
		team.setDefenseRank(10);
		team.setOffenseRank(1);
		team.setRank(1);
		teamService.update(team);
	}
	

}
