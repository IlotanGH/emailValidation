package jnatoli.email.services.intercefes;

/**
 * Email service class.
 * @author jose.natoli.bueno
 *
 */
public interface EmailService {

	/**
	 * Email validate method.
	 * @param email email.
	 * @return true if the email is valid and false if the email is invalid.
	 */
	public abstract boolean validate(String email);
	
}
