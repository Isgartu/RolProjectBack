package com.isgartu.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@Entity
@Table(name = "weapon")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Weapon implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2384770770912432447L;


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
