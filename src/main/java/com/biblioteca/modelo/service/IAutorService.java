package com.biblioteca.modelo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.biblioteca.modelo.entity.Autor;

public interface IAutorService {
	
	List<Autor> findAll();
	void create(Autor autor);
	
}
