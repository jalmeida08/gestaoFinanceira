package br.com.jsa.gestaoFinanceira.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jsa.gestaoFinanceira.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{

	 public Usuario findUsuarioByEmailAndSenha(String email, String senha);
}
