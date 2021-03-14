package com.university.grades.repository;

import com.university.grades.repository.entity.ProfessorAccountEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorAccountRepository extends JpaRepository<ProfessorAccountEntity, Long> {
}
