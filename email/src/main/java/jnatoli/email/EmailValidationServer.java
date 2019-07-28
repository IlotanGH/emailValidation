package jnatoli.email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Email validation server.
 * @author jose.natoli.bueno
 *
 */
@SpringBootApplication
public class EmailValidationServer {

	/**
	 * Main method.
	 * @param args run arguments.
	 */
	public static void main(String[] args) {
		System.setProperty("spring.config.name", "email-server");
		SpringApplication.run(EmailValidationServer.class, args);
	}
	
}
