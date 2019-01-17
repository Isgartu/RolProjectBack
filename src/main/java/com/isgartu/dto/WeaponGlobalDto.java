package com.isgartu.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * General characteristics of the weapons
 * 
 * @author israel.garzon
 *
 */

@Data
public class WeaponGlobalDto implements Serializable {

	private Long id;

	private String name;

	private String damage;
}
