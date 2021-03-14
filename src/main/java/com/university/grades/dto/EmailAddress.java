package com.university.grades.dto;

import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Getter
public class EmailAddress {

    public String email;

    public EmailAddress(
            @Email(message = "Email should be valid")
            @NotNull(message = "Email cannot be null")
            String email) {
        this.email = email;
    }
}
