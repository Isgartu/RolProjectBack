package com.isgartu.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * General characteristics of the players
 * 
 * @author israel.garzon
 *
 */

@Data
public class PlayerGlobalDto implements Serializable {

	private Long id;

	private String gamername;

	private String charactername;

	private int vitality;
}
