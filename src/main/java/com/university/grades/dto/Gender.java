package com.university.grades.dto;

import lombok.Getter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
public class Gender {

    public String gender;

    public Gender(
            @NotNull(message = "Gender cannot be null")
            @Size(min = 1, max = 1, message
                    = "Please use just \"F\" or \"M\"")
                    String gender) {
        this.gender = gender;
    }
}
