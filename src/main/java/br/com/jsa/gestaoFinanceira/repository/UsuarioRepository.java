package br.com.jsa.gestaoFinanceira.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.jsa.gestaoFinanceira.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
