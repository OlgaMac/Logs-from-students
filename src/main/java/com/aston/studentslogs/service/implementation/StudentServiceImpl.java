package com.aston.studentslogs.service.implementation;

import com.aston.studentslogs.domain.entity.StudentEntity;
import com.aston.studentslogs.repository.StudentRepository;
import com.aston.studentslogs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional(readOnly = true)
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public StudentEntity createNewStudent(StudentEntity name) {
        StudentEntity result = studentRepository.save(name);
        return result;
    }

    @Override
    @Transactional
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);

    }

    @Override
    @Transactional
    public List<StudentEntity> getAllStudents() {
        List<StudentEntity> result = studentRepository.findAll();
        return result;
    }
}
