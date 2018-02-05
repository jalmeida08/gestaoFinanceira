package br.com.jsa.gestaoFinanceira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class GestaoFinanceiraApplication extends SpringBootServletInitializer {
	
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(GestaoFinanceiraApplication.class);
    }
    
	public static void main(String[] args) {
		SpringApplication.run(GestaoFinanceiraApplication.class, args);
	}
	
}
