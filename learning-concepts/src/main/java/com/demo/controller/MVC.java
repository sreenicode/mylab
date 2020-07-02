package com.demo.controller;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.model.City;
import com.demo.model.Team;
import com.demo.repo.TeamRepository;
import com.demo.service.CityService;

@Controller
@RequestMapping("/")
public class MVC {
	
	@Autowired
	private ModelAndView mv;
	
	@Autowired
	private TeamRepository teamRepo;
	
	@Autowired
	private CityService cityService;
	
	@RequestMapping("/betting")
	public ModelAndView betting() {
		mv.setViewName("nfl");
		return mv;
	}
	
	@RequestMapping("/getcities")
	public ModelAndView cities() {
		mv.setViewName("cities");
		return mv;
	}

	@RequestMapping("/nfl")
	public ModelAndView nfl(Team team) {
		System.out.println(""+team.getName());
	teamRepo.save(team);
	mv.addObject(team);
		mv.setViewName("nfl");
		return mv;
		
		
	}
	@RequestMapping("/city")
	public ModelAndView getCities() {
		
		List<City> list=cityService.construct();
		ModelMap map=new ModelMap("cityList", list);
		System.out.println(list.size()+":"+map.size());
	//	map.addAttribute("cityList", list);
	//	mv.addAllObjects(map);
		
		//mv("Citylist", map);
		//mv.addAttribute("cityList",list);
		mv.setViewName("cities");
		return new ModelAndView("cities", map);
		
	}
	
}
