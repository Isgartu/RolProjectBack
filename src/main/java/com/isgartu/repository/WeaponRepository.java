package com.isgartu.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.isgartu.model.Weapon;

@Repository
public interface WeaponRepository extends JpaRepository<Weapon, Long> {
	
	List<Weapon> findAll();

	Weapon getById(Long id);

	List<Weapon> findByName(String name);
	List<Weapon> findByBonus(double bonus);
	List<Weapon> findByCritical(String critical);
	List<Weapon> findByType(String type);
	List<Weapon> findByScope(int scope);
	List<Weapon> findByDamage(String damage);
	
	
}
