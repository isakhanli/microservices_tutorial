package com.isakhanli.customer;

public record CustomerRegistrationRequest(
                        String firstName,
                        String lastName,
                        String email) {
}
