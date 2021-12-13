package com.biblioteca.modelo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.modelo.entity.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long>{
	List<Autor> findByNombre(String nombre);
}
