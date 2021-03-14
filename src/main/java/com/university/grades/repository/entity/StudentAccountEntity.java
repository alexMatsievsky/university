package com.university.grades.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity (name = "account_student")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="account_student",uniqueConstraints =
                                    @UniqueConstraint(
                                            name = "UK_STUDENT_EMAIL",
                                            columnNames="email"))
public class StudentAccountEntity {

    @Id
    @SequenceGenerator(
            name = "ACC_STUDENT_ID",
            sequenceName = "ACC_STUDENT_ID",
            allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_STUDENT_ID")
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "first_name", columnDefinition = "VARCHAR(255)")
    private String firstName;

    @Column(name = "second_name", columnDefinition = "VARCHAR(255)")
    private String secondName;

    @Column(columnDefinition = "VARCHAR(5)")
    private String gender;

    @Column(nullable = false, columnDefinition = "VARCHAR(100)" )
    private String email;

    @Column(name = "date_of_birth", columnDefinition = "DATETIME")
    private LocalDateTime dateOfBirth;

    @CreationTimestamp
    @Column(name = "create_date", columnDefinition = "DATETIME")
    private LocalDateTime createDate;

    @UpdateTimestamp
    @Column(name = "modify_date", columnDefinition = "DATETIME")
    private LocalDateTime modifyDate;

    @OneToMany(mappedBy = "studentAccount")
    private Set<GradesEntity> grades;
}
