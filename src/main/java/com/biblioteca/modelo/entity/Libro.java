package com.biblioteca.modelo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Libro {
	
	private Long id;
	
	private String ISBN;
	
	private String titulo;
	
	private Autor autor;

}
