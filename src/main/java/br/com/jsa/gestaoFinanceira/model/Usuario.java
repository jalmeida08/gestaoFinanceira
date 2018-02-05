package br.com.jsa.gestaoFinanceira.model;

import javax.persistence.Entity;

@Entity
public class Usuario extends Pessoa{

	private static final long serialVersionUID = 1L;
	private String email;
	private String senha;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() { 
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
