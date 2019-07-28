package jnatoli.email.services.implementation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jnatoli.email.services.intercefes.EmailService;

/**
 * Email service implementation test class.
 * @author jose.natoli.bueno
 *
 */
public class EmailServiceImplTest {

	/**
	 * Email validation service.
	 */
	private EmailService service;
	
	/**
	 * SetUp method.
	 */
	@Before
	public void setUp() {
		service = new EmailServiceImpl();
	}
	
	@Test
	public void testNullEmail() {
		Assert.assertTrue(!service.validate(null));
	}

	@Test
	public void testEmptyEmail() {
		Assert.assertTrue(!service.validate(""));
	}
	
	@Test
	public void testEmailWithoutAt() {
		Assert.assertTrue(!service.validate("josenatolibuenogmail.com"));
	}
	
	@Test
	public void testEmailWithoutDot() {
		Assert.assertTrue(!service.validate("josenatolibueno@gmailcom"));
	}
	
	@Test
	public void testEmailWithoutAtAndDot() {
		Assert.assertTrue(!service.validate("josenatolibuenogmailcom"));
		
	}
	
	@Test
	public void testEmailWithDotAndAt() {
		Assert.assertTrue(service.validate("jose.natolibueno@gmail.com"));
	}
	
	@Test
	public void testEmailWithDotsAndAt() {
		Assert.assertTrue(service.validate("jose.natoli.bueno@gmail.com"));
	}

	@Test
	public void testEmailWithDotsAndAtAndDots() {
		Assert.assertTrue(service.validate("jose.natoli.bueno@external.gmail.com"));
	}
	
}
