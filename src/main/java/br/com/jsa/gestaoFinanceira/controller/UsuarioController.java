package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jsa.gestaoFinanceira.ComercialUserDetailsService;
import br.com.jsa.gestaoFinanceira.model.Usuario;
import br.com.jsa.gestaoFinanceira.repository.UsuarioRepository;

@Controller
@RequestMapping("/usuario")
public class UsuarioController{

	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private ComercialUserDetailsService comercialUserDetailsService;
	
	@GetMapping("/")
	public String login() { 
		System.out.println("TO AQUI ");
		return "index";
	}
	
	@PostMapping(value="logar")
	public String logar(Usuario usuario) {
		System.out.println("LOGAR");
		this.comercialUserDetailsService.loadUserByUsername(usuario.getEmail());
		return "";
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
		return "redirect:/usuario/form";
	}
}
