package com.isgartu.controller;

import java.util.Collection;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import com.isgartu.service.BasicService;

public abstract class BasicControllerAbstract<T, ID> implements BasicController<T, ID> {

	protected BasicService<T, ID> service;

	@GetMapping({"","/"})
	@Override
	public Collection<T> getAll() {
		return service.findAll();
	}

	@GetMapping({"/{identifier}","/{identifier}/"})
	@Override
	public T getById(@PathVariable ID identifier) {
		return service.getById(identifier);
	}

	@PostMapping({"","/"})
	@Override
	public T post(T object) {
		return service.saveNew(object);
	}

	@PutMapping({"/{identifier}","/{identifier}/"})
	@Override
	public T put(@PathVariable ID identifier, T object) {
		return service.update(object);
	}

	@DeleteMapping({"/{identifier}","/{identifier}/"})
	@Override
	public Boolean delete(@PathVariable ID identifier) {
		return service.delete(identifier);
	}
	
	
}
