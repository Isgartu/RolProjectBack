package com.isgartu.controller;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.isgartu.dto.Dto;
import com.isgartu.dto.WeaponDetailsDto;
import com.isgartu.dto.WeaponGlobalDto;
import com.isgartu.exception.ResourceNotFoundException;
import com.isgartu.model.Weapon;
import com.isgartu.service.impl.WeaponService;

@RestController
@RequestMapping("pathfinder/v1/weapons")
public class WeaponController extends BasicControllerAbstract<Weapon, Long> {

	public WeaponController(WeaponService weaponService) {
		this.service = weaponService;
	}

	@Override
	@Dto(WeaponGlobalDto.class)
	public Collection<Weapon> getAll() {
		return ((WeaponService) service).getAllWeapons();
	}

	@Override
	@GetMapping("/{weaponId}")
	@Dto(WeaponDetailsDto.class)
	public Weapon getById(@PathVariable Long weaponId) {
		return ((WeaponService) service).findWeaponById(weaponId);
	}

	@GetMapping("/search")
	@Dto(WeaponDetailsDto.class)
	public List<Weapon> getWeaponSearch(
			@RequestParam(value = "weaponname", required = false) String weaponName,
			@RequestParam(value = "weaponbonus", required = false) Double weaponBonus,
			@RequestParam(value = "weaponcritical", required = false) String weaponCritical,
			@RequestParam(value = "weapontype", required = false) String weaponType,
			@RequestParam(value = "weaponscope", required = false) Integer weaponScope,
			@RequestParam(value = "weapondamage", required = false) String weaponDamage) {

		if (!StringUtils.isEmpty(weaponName)) {
			return ((WeaponService) service).findWeaponByName(weaponName);
		} else if (!StringUtils.isEmpty(weaponBonus)) {
			return ((WeaponService) service).findWeaponByBonus(weaponBonus);
		} else if (!StringUtils.isEmpty(weaponCritical)) {
			return ((WeaponService) service).findWeaponByCritical(weaponCritical);
		} else if (!StringUtils.isEmpty(weaponType)) {
			return ((WeaponService) service).findWeaponByType(weaponType);
		} else if (!StringUtils.isEmpty(weaponScope)) {
			return ((WeaponService) service).findWeaponByScope(weaponScope);
		} else if (!StringUtils.isEmpty(weaponDamage)) {
			return ((WeaponService) service).findWeaponByDamage(weaponDamage);
		} else {
			throw new ResourceNotFoundException("Invalid Search or invalid SearchParam");
		}
	}

	@Override
	@PostMapping("/insert")
	public Weapon post( @Valid @RequestBody Weapon object) {
		return super.post(object);
	}

	@Override
	@PutMapping("/update/{identifier}")
	public Weapon put(
			@PathVariable Long identifier,
			@Valid @RequestBody Weapon object) {
		return ((WeaponService) service).updateWeapon(object, identifier);
	}

	@Override
	public Boolean delete(Long identifier) {
		// TODO Auto-generated method stub
		return super.delete(identifier);
	}
	
	
	
	
	

}