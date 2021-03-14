package com.university.grades.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Builder
public class StudentDTO {

    private FirstName firstName;
    private SecondName secondName;
    private Gender gender;
    private EmailAddress emailAddress;
    private LocalDateTime dateOfBirth;
}
