package com.isgartu.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
@Entity
@Table(name = "item")
public class Item implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(max = 200)
	private String name;
	
	@Size(max = 200)
	private int weight;
	
	@Size(max = 200)
	private int price;
	
	@Size(max = 200)
	private String description;
	
	@Size(max = 200)
	private String category;
	
}
