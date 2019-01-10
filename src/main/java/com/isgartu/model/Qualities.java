package com.isgartu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "qualities")
public class Qualities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	// force = break database
	private String power;
	        
	private String skill;
	        
	private String physique;
	        
	private String intelligence;
	        
	private String wisdom;
	        
	private String charisma;
	
}
