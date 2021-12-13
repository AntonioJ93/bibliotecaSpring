package com.biblioteca.dto.view;

import java.io.Serializable;

import com.biblioteca.modelo.entity.Nacionalidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutorToViewDto implements Serializable{

	private static final long serialVersionUID = 1L;
	private Long id;
	private String nombre;
	private Nacionalidad nacionalidad;
}
