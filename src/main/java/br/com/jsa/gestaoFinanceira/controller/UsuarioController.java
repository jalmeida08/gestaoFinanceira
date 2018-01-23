package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jsa.gestaoFinanceira.model.Usuario;
import br.com.jsa.gestaoFinanceira.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping("/")
	public String login() { 
		
		return "index";
	}
	
	@GetMapping(value = "/home" )
	public String home() {
		return "usuario/home";
	}
	
	@GetMapping(value="/form")
	public String form(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario/form";
	}
	
	@PostMapping(value="/salvar")
	public String salvar(Usuario usuario) {
		repository.save(usuario);
		return "redirect:/usuario/form";
	}
}
