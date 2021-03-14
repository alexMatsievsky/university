package com.university.grades.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "account_professor")
@Table(name="account_professor",uniqueConstraints =
                                                @UniqueConstraint(
                                                        name = "UK_PROFESSOR_EMAIL",
                                                        columnNames="email"))
public class ProfessorAccountEntity {

        @Id
        @SequenceGenerator(
                name = "ACC_PROFESSOR_ID",
                sequenceName = "ACC_PROFESSOR_ID",
                allocationSize = 1
        )
        @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_PROFESSOR_ID")
        @Column(name = "id", updatable = false)
        private Long id;

        @Column(name = "first_name", columnDefinition = "VARCHAR(255)")
        private String firstName;

        @Column(name = "second_name", columnDefinition = "VARCHAR(255)")
        private String secondName;

        @Column(columnDefinition = "VARCHAR(255)")
        private String subject;

        @Column(nullable = false, columnDefinition = "VARCHAR(100)")
        private String email;

        @Column(name = "date_of_birth", columnDefinition = "DATETIME")
        private LocalDateTime dateOfBirth;

        @CreationTimestamp
        @Column(name = "create_date", columnDefinition = "DATETIME")
        private LocalDateTime createDate;

        @UpdateTimestamp
        @Column(name = "modify_date", columnDefinition = "DATETIME")
        private LocalDateTime modifyDate;

        @OneToMany(mappedBy = "professorAccount")
        private Set<GradesEntity> grades;
}

