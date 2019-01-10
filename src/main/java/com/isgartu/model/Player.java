package com.isgartu.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import lombok.Data;

@Data
@Entity
@Table(name = "player")
//character = break database
public class Player implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String gamername;
	
	private String charactername;
	
	private int vitality;
	
	//Sustituir el String por el enum
//	@Enumerated(EnumType.ORDINAL)
//	private ClassType gamerClass;
	private String gamerclass;
	
	private int level;
	
	@OneToMany
	private List<Item> inventory;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "clothing_id", nullable = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Clothing clothing;
	
	@OneToMany
	private List<Weapon> weapon;

//	@ManyToOne(fetch = FetchType.EAGER, optional = false)
//	@JoinColumn(name = "attribute_id", nullable = false, referencedColumnName = "attribute")
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	private Attribute attribute;
	
}
