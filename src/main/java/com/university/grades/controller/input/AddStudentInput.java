package com.university.grades.controller.input;

import com.university.grades.dto.EmailAddress;
import com.university.grades.dto.FirstName;
import com.university.grades.dto.Gender;
import com.university.grades.dto.SecondName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class AddStudentInput {

    private FirstName firstName;
    private SecondName secondName;
    private Gender gender;
    private EmailAddress emailAddress;
    private LocalDateTime dateOfBirth;
}
