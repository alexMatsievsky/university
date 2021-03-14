package com.university.grades.repository;

import com.university.grades.repository.entity.StudentAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAccountRepository extends JpaRepository<StudentAccountEntity, Long>{

    StudentAccountEntity findByEmail(String email);
}
