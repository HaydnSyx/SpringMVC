package com.springmvc.study.webflow.pizza.actions;

import static org.apache.log4j.Logger.getLogger;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springmvc.study.common.CustomerNotFoundException;
import com.springmvc.study.webflow.pizza.model.CashOrCheckPayment;
import com.springmvc.study.webflow.pizza.model.CreditCardPayment;
import com.springmvc.study.webflow.pizza.model.Customer;
import com.springmvc.study.webflow.pizza.model.Order;
import com.springmvc.study.webflow.pizza.model.Payment;
import com.springmvc.study.webflow.pizza.model.PaymentDetails;
import com.springmvc.study.webflow.pizza.model.PaymentType;
import com.springmvc.study.webflow.pizza.service.CustomerService;

@Component
public class PizzaFlowActions {

	private static final Logger LOGGER = getLogger(PizzaFlowActions.class);

	@Autowired
	CustomerService customerServiceImpl;

	public Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException {
		Customer customer = customerServiceImpl.lookupCustomer(phoneNumber);
		if (customer != null) {
			return customer;
		} else {
			throw new CustomerNotFoundException();
		}
	}

	public boolean checkDeliveryArea(String zipCode) {
		LOGGER.warn("TODO: Flesh out the checkDeliveryArea() method.");
		return "75075".equals(zipCode);
	}

	public void addCustomer(Customer customer) {
		LOGGER.warn("TODO: Flesh out the addCustomer() method.");
	}

	public Payment verifyPayment(PaymentDetails paymentDetails) {
		Payment payment = null;
		if (paymentDetails.getPaymentType() == PaymentType.CREDIT_CARD) {
			payment = new CreditCardPayment();
		} else {
			payment = new CashOrCheckPayment();
		}

		return payment;
	}

	public void saveOrder(Order order) {
		LOGGER.warn("TODO: Flesh out the saveOrder() method.");
	}
}
