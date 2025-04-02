package com.ameda.kevin.kafka.order;

public record Customer(
        String id,
        String firstName,
        String lastName,
        String email
) {
}
