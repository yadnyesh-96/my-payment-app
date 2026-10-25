package com.payment.app.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {

	public String getPaymentStatus() {
		return "My Payment App is running successfully!";
	}

	public String getPaymentProcessingMessage() {
		return "Payment is being processed.";
	}
}