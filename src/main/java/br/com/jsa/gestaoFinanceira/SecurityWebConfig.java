package br.com.jsa.gestaoFinanceira;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

	@Autowired
	private ComercialUserDetailsService comercialUserDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/bootstrap/**").permitAll()
			.anyRequest()
			.authenticated()
			.and()
		.formLogin()
			.loginPage("/usuario/")
			.permitAll();
	}
	
	@Override
	  protected void configure(AuthenticationManagerBuilder builder) throws Exception {
	    builder
	        .userDetailsService(this.comercialUserDetailsService)
	        .passwordEncoder(new BCryptPasswordEncoder());
	  }
}
