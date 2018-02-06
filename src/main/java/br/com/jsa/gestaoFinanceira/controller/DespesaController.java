package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.jsa.gestaoFinanceira.model.Despesa;

@Controller
@RequestMapping("/despesa")
public class DespesaController {
	
	@GetMapping("/form")
	public String teste(Model model) {
		model.addAttribute("despesa", new Despesa());
		return "despesa/form-despesa";
	}

}
