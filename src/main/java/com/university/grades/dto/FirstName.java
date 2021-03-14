package com.university.grades.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;

@Getter
public class FirstName {

    public String firstName;

    public FirstName(@NotNull(message = "First name cannot be null")String firstName) {
        this.firstName = firstName;
    }

}
