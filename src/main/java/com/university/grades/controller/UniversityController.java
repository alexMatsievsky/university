package com.university.grades.controller;

import com.university.grades.controller.input.AddStudentInput;
import com.university.grades.facade.UniversityFacade;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("university/v1")
//@CrossOrigin("*")
@RequiredArgsConstructor
@Slf4j
public class UniversityController {

    private static UniversityFacade universityFacade;


    @PutMapping(
            path = "/student"
    )
    @ResponseStatus(HttpStatus.CREATED)

    public void addStudent (
            @RequestBody AddStudentInput addStudentInput){
        log.info("UniversityController.addStudent | addStudentInput: " + addStudentInput);
        universityFacade.addStudent(addStudentInput);

    }
}
