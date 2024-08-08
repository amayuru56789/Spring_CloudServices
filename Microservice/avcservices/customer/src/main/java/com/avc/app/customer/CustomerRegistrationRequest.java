package com.avc.app.customer;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {

}
