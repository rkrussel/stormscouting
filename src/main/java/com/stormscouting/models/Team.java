package com.stormscouting.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
@Entity
@Table(name = "teams")
public class Team {
	private String teamName;
	private List<player>roster;
	private List<player>lineup;
	
	public Team(){}
	public Team(String name){
		super();
		this.teamName = name;
	}
	@NotNull
	@Column(name = "team_name", unique = true)
	public String getName(){
		return teamName;
	}
	public void setName(String name){
		this.teamName = name;
	}
	@OneToMany
    @JoinColumn(name = "player_uid")
	public List<player> getRoster(){
		return roster;
	}
	public void setRoster(player player){
		this.roster.add(player);
	}
	@OneToMany
	@JoinColumn(name = "player_uid")
	public List<player> getLineup(){
		return lineup;
	}
	public void setLineup(player p1, player p2, player p3, player p4, player p5, player p6){
		this.lineup.add(p1);
		this.lineup.add(p2);
		this.lineup.add(p3);
		this.lineup.add(p4);
		this.lineup.add(p5);
		this.lineup.add(p6);
	}
	public void addToRoster(player player){
		this.roster.add(player);
	}
}
