package com.avc.app.customer;

import org.springframework.stereotype.Service;

/**
 * @author amayuru_i
 * @project avcservices
 */

@Service
public record CustomerService() {
    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();
        // todo: check if email valid
        // todo: check if email not taken
        // todo: store customer in db
    }
}
