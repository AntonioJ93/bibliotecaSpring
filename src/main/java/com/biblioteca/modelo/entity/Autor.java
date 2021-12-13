package com.biblioteca.modelo.entity;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Data
@NoArgsConstructor
public class Autor {
	
	private Long id;
	private String nombre;
	private Nacionalidad nacionalidad;
	
	@Singular
	private List<Libro> libros;
	
}
