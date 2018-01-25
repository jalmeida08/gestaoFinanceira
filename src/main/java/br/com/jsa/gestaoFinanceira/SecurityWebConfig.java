package br.com.jsa.gestaoFinanceira;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityWebConfig extends WebSecurityConfigurerAdapter {

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
	

}
