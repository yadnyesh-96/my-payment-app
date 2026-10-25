package com.payment.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.payment.app.service.PaymentService;

class PaymentServiceTest {

	@Test
	void shouldReturnPaymentAppStatus() {

		// Arrange
		PaymentService paymentService = new PaymentService();

		// Act
		String result = paymentService.getPaymentStatus();

		// Assert
		assertEquals("My Payment App is running successfully!", result);
	}
}