package com.biblioteca.dto;


import org.springframework.stereotype.Service;

import com.biblioteca.dto.view.LibroToControllerDto;
import com.biblioteca.dto.view.LibroToViewDto;

import com.biblioteca.modelo.entity.Libro;
import com.biblioteca.modelo.service.IAutorService;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class LibroMapper {

	private Libro libro;
	private LibroToViewDto libroToViewDto;
	private LibroToControllerDto libroToControllerDto;
	

	public LibroToViewDto libroToViewDto() {
		libroToViewDto = LibroToViewDto.builder()
				.id(libro.getId())
				.ISBN(libro.getISBN())
				.titulo(libro.getTitulo())
				.nombreAutor(libro.getAutor().getNombre())
				.build();
		return libroToViewDto;
	}
	
	public Libro libroToControllerDto(IAutorService autorService) {
		libro=Libro.builder()
				.id(libroToControllerDto.getId())
				.ISBN(libroToControllerDto.getISBN())
				.titulo(libroToControllerDto.getTitulo())
				.autor(autorService.findById(libroToControllerDto.getIdAutor()).get())
				.build();
		return libro;
	}
}
