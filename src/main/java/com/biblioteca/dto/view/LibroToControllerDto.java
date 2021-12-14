package com.biblioteca.dto.view;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LibroToControllerDto implements Serializable{

	
	private static final long serialVersionUID = 1L;
	private Long id;
	private Long idAutor;
	private String ISBN;
	private String titulo;
}
