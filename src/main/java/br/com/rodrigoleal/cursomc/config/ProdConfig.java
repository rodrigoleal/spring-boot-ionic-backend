package br.com.rodrigoleal.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import br.com.rodrigoleal.cursomc.services.DBService;

@Configuration
@Profile("prod")
public class ProdConfig {
	
	@Autowired
	private DBService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean instaciateDatabase() throws ParseException {
		/*
		if (!"create".equals(strategy)) {
			return false;
		}
		*/
		
		dbService.instanciateDatabase();
		return true;
	}
}
