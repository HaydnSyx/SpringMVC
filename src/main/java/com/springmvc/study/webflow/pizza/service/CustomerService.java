package com.springmvc.study.webflow.pizza.service;

import com.springmvc.study.common.CustomerNotFoundException;
import com.springmvc.study.webflow.pizza.model.Customer;

public interface CustomerService {
	Customer lookupCustomer(String phoneNumber) throws CustomerNotFoundException;
}