package com.aston.studentslogs.repository;

import com.aston.studentslogs.domain.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    List<StudentEntity> findAll();
    Optional<StudentEntity> findById(Long id);

    void deleteById(Long aLong);
}
