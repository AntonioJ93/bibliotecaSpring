package com.biblioteca.dto;

import com.biblioteca.dto.view.LibroToViewDto;

import com.biblioteca.modelo.entity.Libro;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroMapper {

	private Libro libro;
	private LibroToViewDto libroToViewDto;

	public LibroToViewDto libroToViewDto() {
		libroToViewDto = LibroToViewDto.builder()
				.id(libro.getId())
				.ISBN(libro.getISBN())
				.titulo(libro.getTitulo())
				.nombreAutor(libro.getAutor().getNombre())
				.build();
		return libroToViewDto;
	}

}
