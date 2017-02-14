package com.stormscouting.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Hits")
public class Hit {
	private char side;
	private boolean k;
	private int zone;
	private int depth;
	private player owner;
	private boolean run;


	public Hit(){}
	
	public Hit(boolean k, char side, int zone, int depth){
		super();
		this.k = k;
		this.side = side;
		this.zone = zone;
		this.depth = depth;
	}
	@ManyToOne
	public player getOwner(){
		return owner;
	}
	public void setOwner(player owner){
		this.owner = owner;
	}
	@NotNull
	@Column(name = "side")
	public char getSide() {
		return side;
	}
	
	public void setSide(char side) {
		this.side = side;
	}
	@Column(name = "k")
	public boolean isK() {
		if(this.k){
			this.side = 'k';
			this.depth = 0;
			this.zone =  0;
			this.run = false;
		}
		return k;
	}
	@Column(name = "Run")
	public boolean isRun(){
		return run;
	}
	public void setRun(boolean run){
		this.run = run;
	}

	public void setK(boolean k) {
		this.k = k;
	}
	@NotNull
	@Column(name = "zone")
	public int getZone() {
		return zone;
	}

	public void setZone(int zone) {
		this.zone = zone;
	}
	@NotNull
	@Column(name = "depth")
	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	
}
