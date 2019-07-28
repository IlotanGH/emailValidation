package jnatoli.email.model;

/**
 * Email response class.
 * @author jose.natoli.bueno
 *
 */
public class EmailResponse {

	/**
	 * Response attribute, true is email is valid and false if email is invalid.
	 */
	private String response;

	/**
	 * Build.
	 * @param response
	 */
	public EmailResponse(String response) {
		super();
		this.response = response;
	}

	/**
	 * Getter method to response.
	 * @return
	 */
	public String getResponse() {
		return response;
	}

	/**
	 * Setter method to response.
	 * @param response
	 */
	public void setResponse(String response) {
		this.response = response;
	}

	/**
	 * ToString method.
	 */
	@Override
	public String toString() {
		return "EmailResponse [response=" + response + "]";
	}
	
}
