package com.biblioteca.dto.view;

import com.biblioteca.modelo.entity.Nacionalidad;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AutorToControllerDto {
	
	private String nombre;
	
	private Nacionalidad nacionalidad;
	

}
