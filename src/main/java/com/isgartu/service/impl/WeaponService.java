package com.isgartu.service.impl;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.isgartu.exception.ResourceNotFoundException;
import com.isgartu.model.Weapon;
import com.isgartu.repository.WeaponRepository;
import com.isgartu.service.BasicServiceAbstract;

@Service
public class WeaponService extends BasicServiceAbstract<Weapon, Long>{

	public WeaponService(WeaponRepository weaponRepository) {
        this.repository = weaponRepository;
    }
	
	public List<Weapon> getAllWeapons() {
		return ((WeaponRepository) repository).findAll();
	}

	public Weapon findWeaponById(Long weaponId) {
		return ((WeaponRepository) repository).getById(weaponId);
	}
	
	public List<Weapon> findWeaponByName(String name) {
        return ((WeaponRepository) repository).findByName(name);
    }

	public List<Weapon> findWeaponByBonus(Double weaponBonus) {
		return ((WeaponRepository) repository).findByBonus(weaponBonus);
	}

	public List<Weapon> findWeaponByCritical(String weaponCritical) {
		return ((WeaponRepository) repository).findByCritical(weaponCritical);
	}

	public List<Weapon> findWeaponByType(String weaponType) {
		return ((WeaponRepository) repository).findByType(weaponType);
	}

	public List<Weapon> findWeaponByScope(Integer weaponScope) {
		return ((WeaponRepository) repository).findByScope(weaponScope);
	}

	public List<Weapon> findWeaponByDamage(String weaponDamage) {
		return ((WeaponRepository) repository).findByDamage(weaponDamage);
	}

	public Weapon updateWeapon(@Valid Weapon object, Long identifier) {
		if(object.getId() != null && !object.getId().equals(identifier)) {
			throw new ResourceNotFoundException("Url identifier param is different thant object id");
		} else if(StringUtils.isEmpty(object.getId())) {
			object.setId(identifier);
		}
		return ((WeaponRepository) repository).save(object);
	}
}
