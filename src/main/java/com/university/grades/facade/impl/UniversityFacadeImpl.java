package com.university.grades.facade.impl;

import com.university.grades.controller.input.AddStudentInput;
import com.university.grades.dto.FirstName;
import com.university.grades.dto.Gender;
import com.university.grades.dto.SecondName;
import com.university.grades.dto.StudentDTO;
import com.university.grades.facade.UniversityFacade;
import com.university.grades.service.StudentAccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UniversityFacadeImpl implements UniversityFacade {

    private static StudentAccountService studentAccountService;

    @Override
    public void addStudent(AddStudentInput addStudentInput) {

        StudentDTO studentDTO = getStudentDTO(addStudentInput);
        studentAccountService.addStudent(studentDTO);
    }

    private StudentDTO getStudentDTO(AddStudentInput addStudentInput) {
        return StudentDTO.builder()
                    .firstName( addStudentInput.getFirstName())
                    .secondName(addStudentInput.getSecondName())
                    .gender(addStudentInput.getGender())
                    .dateOfBirth(addStudentInput.getDateOfBirth())
                    .build();
    }
}
