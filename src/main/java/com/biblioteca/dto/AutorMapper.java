package com.biblioteca.dto;

import com.biblioteca.dto.view.AutorToViewDto;
import com.biblioteca.modelo.entity.Autor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Data
@AllArgsConstructor
@Builder
public class AutorMapper {
	private Autor autor;
	private AutorToViewDto autorToViewDto;
	
	public AutorToViewDto autorToViewDto() {
		autorToViewDto=AutorToViewDto.builder()
				.id(autor.getId())
				.nombre(autor.getNombre())
				.build();
		return autorToViewDto;
	}
}
