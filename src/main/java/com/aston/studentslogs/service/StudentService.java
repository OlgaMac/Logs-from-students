package com.aston.studentslogs.service;

import com.aston.studentslogs.domain.entity.StudentEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {

    StudentEntity createNewStudent(StudentEntity name);

    void deleteStudentById(Long studentId);

    List<StudentEntity> getAllStudents();
}
