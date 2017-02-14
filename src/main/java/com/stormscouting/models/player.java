package com.stormscouting.models;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "players")
public class player {
	private int number;
	private String first;
	private String last;
	private char hand;
	private ArrayList<Hit>hits = new ArrayList<Hit>();
	private Team team;
	private float average;
	public Hit lastHit;
	public player(){}
	public player(int number, String first, String last, char hand, Team team) {
		super();
		this.number = number;
		this.first = first;
		this.last = last;
		this.hand = hand;
		this.team = team;
		
	}
	@NotNull
	@Column(name = "number")
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	@NotNull
	@Column(name = "first")
	public String getFirst() {
		return first;
	}
	public void setFirst(String first) {
		this.first = first;
	}
	@NotNull
	@Column(name = "last")
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	@NotNull
	@Column(name = "hand")
	public char getHand() {
		return hand;
	}
	public void setHand(char hand) {
		this.hand = hand;
	}
	@OneToMany
	@JoinColumn(name="owner_uid", unique = true)
	public ArrayList<Hit> getHits() {
		return hits;
	}
	public void setHits(ArrayList<Hit> hits) {
		this.hits = hits;
	}
	public void addHit(Hit hit){
		this.hits.add(hit);
	}
	@ManyToOne
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	public float getAverage() {
		return average;
	}
	public void setAverage() {
		int counter = 0;
		for(int i = 0; i < hits.size(); i++){
			if(hits.get(i).isRun()){
				counter++;
			}
		}
		this.average = counter / this.hits.size();
	}
	
	
	public void addHit(){
		this.hits.add(lastHit);
	}
		

	
	
}
