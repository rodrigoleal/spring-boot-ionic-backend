package br.com.rodrigoleal.cursomc.services;

import org.springframework.security.core.context.SecurityContextHolder;

import br.com.rodrigoleal.cursomc.security.UserSS;

public class UserService {
	
	public static UserSS authenticated() {
		try {
			//retorna o usuário logado no sistema
			return (UserSS) SecurityContextHolder.getContext().getAuthentication().getPrincipal();			
		} catch (Exception e) {
			return null;
		}
	}	
}
