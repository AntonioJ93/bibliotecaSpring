package com.biblioteca.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.biblioteca.dto.AutorMapper;
import com.biblioteca.dto.LibroMapper;
import com.biblioteca.dto.view.AutorToViewDto;
import com.biblioteca.dto.view.LibroToControllerDto;
import com.biblioteca.dto.view.LibroToViewDto;
import com.biblioteca.modelo.entity.Autor;
import com.biblioteca.modelo.entity.Libro;
import com.biblioteca.modelo.service.IAutorService;
import com.biblioteca.modelo.service.ILibroService;

@Controller
@RequestMapping("/libro")
public class ControllerLibro {

	@Autowired
	private ILibroService libroService;

	@Autowired
	private IAutorService autorService;
	
	@GetMapping("/listar")
	public String listaLibroToViewDto(Model model) {
		List<Libro> libros = libroService.findAll();
		List<LibroToViewDto> listaDto = new ArrayList<>();
		libros.forEach(lib -> listaDto.add(LibroMapper.builder().libro(lib).build().libroToViewDto()));
		model.addAttribute("libros", listaDto);

		return "/libro/lista";
	}
	
	@GetMapping("/form-guardar")
	public String formularioGuardar(Model model) {
		List<AutorToViewDto> listAutor=new ArrayList<>();
		List<Autor> autores=autorService.findAll();	
		autores.forEach(aut->listAutor.add(AutorMapper.builder().autor(aut).build().autorToViewDto()));
		model.addAttribute("autores", autores);
		model.addAttribute("libro", LibroToControllerDto.builder().build());
		return "/libro/formGuardar";
	}
	
	@PostMapping("/guardar")
	public String guardarLibro(@ModelAttribute("libro") LibroToControllerDto libroToControllerDto) {
		Libro libro=LibroMapper.builder().libroToControllerDto(libroToControllerDto).build().libroToControllerDto(autorService);
		libroService.create(libro);
		return "redirect:/libro/listar";
	}
	

}
