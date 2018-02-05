package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jsa.gestaoFinanceira.model.Usuario;

@Controller
@RequestMapping("/usuario")
public class UsuarioController{

	@GetMapping("/")
	public String login(Model model) { 
		model.addAttribute("usuario", new Usuario());
		return "index";
	}
	
	@PostMapping(value="logar")
	public String logar(@ModelAttribute("usuario") Usuario usuario) {
		System.out.println("email: "+ usuario.getEmail() + " Senha: " + usuario.getSenha());
		
		
		return "redirect:/despesa/home";
	}
	
	@GetMapping(value = "/home" )
	public String home(Model model) {
		return "usuario/home";
	}
	
	@GetMapping(value="/form")
	public String form(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "usuario/form";
	}
	
	@PostMapping(value="/salvar")
	public String salvar(@ModelAttribute("usuario") Usuario usuario, Model model) {
		
		return "redirect:/usuario/home";
	}
}
