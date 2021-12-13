package com.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.dto.LibroMapper;
import com.biblioteca.dto.view.LibroToViewDto;
import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.entity.Libro;
import com.biblioteca.modelo.entity.Nacionalidad;
import com.biblioteca.modelo.service.ILibroService;

@Controller
@RequestMapping("/libro")
public class ControllerLibro {

	@Autowired
	private ILibroService libroService;

	@GetMapping("/listar")
	public String listaLibroToViewDto(Model model) {
		List<Libro> libros = libroService.findAll();
		List<LibroToViewDto> listaDto = new ArrayList<>();
		libros.forEach(lib -> listaDto.add(LibroMapper.builder().libro(lib).build().libroToViewDto()));
		model.addAttribute("libros", listaDto);

		return "/libro/lista";
	}
	

}
