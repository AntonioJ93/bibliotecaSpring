package com.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.dto.AutorMapper;
import com.biblioteca.dto.view.AutorToControllerDto;
import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.entity.Nacionalidad;

@Controller
@RequestMapping("/autor")
public class ControllerAutor {

	
	@GetMapping("/form-guardar")
	public String formularioGuardar(Model model) {
		model.addAttribute("autor", AutorToControllerDto.builder().build());
		model.addAttribute("nacionalidades", Nacionalidad.values());
		return "/autor/formGuardar";
	}
	
	@GetMapping("/guardar")
	public String formularioGuardar(@ModelAttribute("autor") AutorToControllerDto autorToControllerDto) {
		Autor autor=AutorMapper.builder().autorToControllerDto(autorToControllerDto)
		return "/autor/formGuardar";
	}
}
