package com.isgartu.controller;

import java.util.Collection;

interface BasicController<T, ID> {

	Collection<T> getAll();

	T getById(ID identifier);

    T post(T object);

    T put(ID identifier, T object);

    Boolean delete(ID identifier);
}
