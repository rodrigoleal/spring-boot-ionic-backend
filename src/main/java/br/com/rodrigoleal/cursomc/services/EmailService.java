package br.com.rodrigoleal.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import br.com.rodrigoleal.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
