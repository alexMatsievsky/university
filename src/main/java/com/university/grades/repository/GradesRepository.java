package com.university.grades.repository;

import com.university.grades.repository.entity.GradesEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradesRepository extends JpaRepository<GradesEntity, Long> {
}
