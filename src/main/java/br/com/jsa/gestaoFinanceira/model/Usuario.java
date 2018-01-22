package br.com.jsa.gestaoFinanceira.model;

import java.security.MessageDigest;

import javax.persistence.Entity;

@Entity
public class Usuario extends Pessoa {

	private String usuario;
	private String senha;

	public Usuario() {
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		try {
			MessageDigest algorithm = MessageDigest.getInstance("SHA-256");
			byte messageDigest[] = algorithm.digest(senha.getBytes("UTF-8"));

			StringBuilder hexString = new StringBuilder();
			for (byte b : messageDigest) {
				hexString.append(String.format("%02X", 0xFF & b));
			}
			this.senha = hexString.toString();
		} catch (Exception e) {
			
		}

	}

}
