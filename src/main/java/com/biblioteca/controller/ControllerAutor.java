package com.biblioteca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.dto.AutorMapper;
import com.biblioteca.dto.view.AutorToControllerDto;
import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.entity.Nacionalidad;
import com.biblioteca.modelo.service.IAutorService;

@Controller
@RequestMapping("/autor")
public class ControllerAutor {

	@Autowired
	private IAutorService autorService;
	
	@GetMapping("/form-guardar")
	public String formularioGuardar(Model model) {
		model.addAttribute("autor", AutorToControllerDto.builder().build());
		model.addAttribute("nacionalidades", Nacionalidad.values());
		return "/autor/formGuardar";
	}
	
	@PostMapping("/guardar")
	public String formularioGuardar(@ModelAttribute("autor") AutorToControllerDto autorToControllerDto) {
		Autor autor=AutorMapper.builder().autorToControllerDto(autorToControllerDto).build().ControllerDtoToautor();
		autorService.create(autor);
		return "/autor/formGuardar";
	}
}
