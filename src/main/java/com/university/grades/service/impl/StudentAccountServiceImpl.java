package com.university.grades.service.impl;

import com.university.grades.dto.StudentDTO;
import com.university.grades.repository.StudentAccountRepository;
import com.university.grades.repository.entity.StudentAccountEntity;
import com.university.grades.service.StudentAccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class StudentAccountServiceImpl implements StudentAccountService {

    private static StudentAccountRepository studentAccountRepository;

    @Override
    public void addStudent(StudentDTO studentDTO) {

        log.info("StudentAccountService.addStudent | studentDTO: " + studentDTO);
        StudentAccountEntity studentAccountEntity = getStudentAccountEntity(studentDTO);
        studentAccountRepository.save(studentAccountEntity);
    }

    private StudentAccountEntity getStudentAccountEntity(StudentDTO studentDTO) {
        return StudentAccountEntity.builder()
                .firstName(studentDTO.getFirstName().firstName)
                .secondName(studentDTO.getSecondName().secondName)
                .gender(studentDTO.getGender().gender)
                .email(studentDTO.getEmailAddress().email)
                .dateOfBirth(studentDTO.getDateOfBirth())
                .build();
    }
}
