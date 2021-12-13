package com.biblioteca.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.modelo.entity.Autor;

public interface IAutorRepository extends JpaRepository<Autor, Long>{

}
