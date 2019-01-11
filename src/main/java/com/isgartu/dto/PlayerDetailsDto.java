package com.isgartu.dto;

import java.io.Serializable;
import java.util.List;

import com.isgartu.model.Clothing;
import com.isgartu.model.Item;
import com.isgartu.model.Qualities;
import com.isgartu.model.Weapon;

import lombok.Data;

/**
 * Player details
 * 
 * @author israel.garzon
 *
 */
@Data
public class PlayerDetailsDto implements Serializable{

	private Long id;
	
	private String gamername;
	
	private String charactername;
	
	private int vitality;
	
	private String gamerclass;
	
	private int level;
	
	private List<Item> inventory;
	
	private Clothing clothing;
	
	private List<Weapon> weapon;

	private Qualities qualities;
}
