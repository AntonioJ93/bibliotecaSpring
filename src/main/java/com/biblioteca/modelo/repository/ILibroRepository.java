package com.biblioteca.modelo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.modelo.entity.Libro;

public interface ILibroRepository extends JpaRepository<Libro, Long>{

}
