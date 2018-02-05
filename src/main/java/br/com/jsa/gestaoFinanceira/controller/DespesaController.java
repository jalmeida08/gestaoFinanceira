package br.com.jsa.gestaoFinanceira.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/despesa")
public class DespesaController {
	
	@ResponseBody
	@GetMapping("/home")
	public String teste() {
		return "teste";
	}

}
