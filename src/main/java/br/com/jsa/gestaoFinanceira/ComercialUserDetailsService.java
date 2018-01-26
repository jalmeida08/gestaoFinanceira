package br.com.jsa.gestaoFinanceira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import br.com.jsa.gestaoFinanceira.model.Usuario;
import br.com.jsa.gestaoFinanceira.repository.UsuarioRepository;

@Component
public class ComercialUserDetailsService implements UserDetailsService {
	
  @Autowired
  private UsuarioRepository repository;

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    Usuario usuario = repository.findByEmail(username);
		System.out.println("________________________: " + username);
    if (usuario == null) {
      throw new UsernameNotFoundException("Usuário não encontrado!");
    }
		
    return usuario;
  }
}