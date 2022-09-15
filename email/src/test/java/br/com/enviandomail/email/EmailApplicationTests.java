package br.com.enviandomail.email;

import java.util.Properties;

import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class EmailApplicationTests {
	
	private String userName = "leonardo.estevam@uni9.edu.br";
	private String senha = "N@do1709";

	@Test
	public void testEmail() {
		
		try {
		Properties pr = new Properties();
		pr.put("mail.smtp.ssl.trust", "*");
		pr.put("mail.smtp.auth", "true"); // Autorização
		pr.put("mail.smtp.starttls", "true"); //Autenticação
		pr.put("mail.smtp.host", "smtp.gmail.com"); // Servidor gmail Google
		pr.put("mail.smtp.port", "465"); // Porta do servidor
		pr.put("mail.smtp.socketFactory.port", "465"); // Expecifica a porta a ser conectada pelo socket
		pr.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory"); //Classe socket de conexão
		
		Session secao = Session.getInstance(pr, new Authenticator() {
			@Override
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(userName, senha);
			}
		});
		
		Address[] toUser = InternetAddress.parse("leonardo.estevam@uni9.edu.br");
		
		Message ms = new MimeMessage(secao);
		ms.setFrom(new InternetAddress(userName, "Leonardo Estevam"));
		ms.setRecipients(Message.RecipientType.TO, toUser);
		ms.setSubject("Chegou o e-mail");
		ms.setText("Olá program");
		
		Transport.send(ms);
		
		Thread.sleep(5000);
		
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
