package com.isgartu.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "body")
public class Body {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String head;
	
	private String neck;
	
	private String shoulders;
	
	private String arms;
	
	private String gloves;
	
	private String armor;
	
	private String legs;
	
	private String feet;
}
