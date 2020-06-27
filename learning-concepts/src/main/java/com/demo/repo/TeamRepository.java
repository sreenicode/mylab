package com.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.model.Team;

public interface TeamRepository extends JpaRepository<Team, String>{

}
