package jnatoli.email.services.implementation;

import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import jnatoli.email.services.intercefes.EmailService;

/**
 * Email implementation service class.
 * @author jose.natoli.bueno
 *
 */
@Service
public class EmailServiceImpl implements EmailService {
	
	/**
	 * Email service logger.
	 */
	private Logger logger = Logger.getLogger(EmailServiceImpl.class.getName());

	@Override
	public boolean validate(String email) {
		logger.info("Invoking service with email = "+ email);
		boolean response = false;
		if (email != null) {
			String regex = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
			response = email.matches(regex);
		}
		logger.info("Service response = " + response);
		return response;
	}
	
}
