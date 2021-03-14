package com.university.grades.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "grades")
@Table(name="grades",uniqueConstraints =
            @UniqueConstraint(
                name = "UK_STUDENT_ID_PROFESSOR_ID",
                columnNames={"student_id", "professor_id"}))
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GradesEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "student_id", nullable = false)
    private StudentAccountEntity studentAccount;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "professor_id",nullable = false)
    private ProfessorAccountEntity professorAccount;

    @Column(nullable = false)
    private Integer grade;

    @Column(nullable = false)
    private Integer semester;




}
