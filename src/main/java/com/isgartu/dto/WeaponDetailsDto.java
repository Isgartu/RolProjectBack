package com.isgartu.dto;

import java.io.Serializable;

import lombok.Data;

/**
 * Weapon details
 * 
 * @author israel.garzon
 *
 */

@Data
public class WeaponDetailsDto implements Serializable {

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
