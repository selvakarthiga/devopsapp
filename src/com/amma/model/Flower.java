package com.amma.model;
import javax.persistence.*;


@Entity
@Table(name="Flower")
public class Flower {	
	@Id
	private String name;
	private String cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}

}
