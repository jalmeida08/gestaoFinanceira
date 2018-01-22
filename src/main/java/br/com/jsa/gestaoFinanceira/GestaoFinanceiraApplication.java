package br.com.jsa.gestaoFinanceira;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class GestaoFinanceiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoFinanceiraApplication.class, args);
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/gestao_financeira");
		dataSource.setUsername("root");
		dataSource.setPassword("101903@j");
		return dataSource;
	}
	
	
}
