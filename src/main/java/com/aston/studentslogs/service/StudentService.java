package com.aston.studentslogs.service;

import com.aston.studentslogs.domain.entity.StudentEntity;
import com.aston.studentslogs.model.Student;

import javax.validation.Valid;
import java.util.List;

public interface StudentService {

    StudentEntity createNewStudent(StudentEntity name);

    void deleteStudentById(Long studentId);

    List<StudentEntity> getAllStudents();
}
