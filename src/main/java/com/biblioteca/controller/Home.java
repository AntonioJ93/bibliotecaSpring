package com.biblioteca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/home")
@Controller
public class Home {
	
	public String listar(Model model) {
		
		return "index";
	}
	
	private void inicializarBBDD() {
		
	}

}
