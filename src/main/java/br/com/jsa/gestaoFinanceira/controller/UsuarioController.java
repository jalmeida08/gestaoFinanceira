package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@GetMapping("/")
	public String login() { 
		return "index";
	}
	
	@GetMapping(value = "/home" )
	public String home() {
		return "usuario/home";
	}
}
