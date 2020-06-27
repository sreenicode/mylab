package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

import lombok.Data;


@Entity
public class Team {
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getOffenseRank() {
		return offenseRank;
	}
	public void setOffenseRank(int offenseRank) {
		this.offenseRank = offenseRank;
	}
	public int getDefenseRank() {
		return defenseRank;
	}
	public void setDefenseRank(int defenseRank) {
		this.defenseRank = defenseRank;
	}
	@Id
	private String name;
	private int rank;
	private int offenseRank;
	private int defenseRank;

}
