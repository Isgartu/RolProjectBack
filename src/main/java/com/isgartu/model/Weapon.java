package com.isgartu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "weapon")
//@Embeddable
public class Weapon {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	

	private String name;
	
	private double bonus;
	
	private String critical;
	
	private String type;
	
	private int scope;
	
	private String munition;
	
	private String damage;
	
	private String otherinfo;

	
}
