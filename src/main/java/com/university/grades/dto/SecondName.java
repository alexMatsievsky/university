package com.university.grades.dto;

import lombok.Getter;

import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotNull;

@Getter
public class SecondName {
    public String secondName;

    public SecondName(@NotNull(message = "Second name cannot be null") String secondName) {
        this.secondName = secondName;
    }
}
