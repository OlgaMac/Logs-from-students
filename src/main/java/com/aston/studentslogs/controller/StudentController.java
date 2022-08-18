package com.aston.studentslogs.controller;

import com.aston.studentslogs.domain.entity.StudentEntity;
import com.aston.studentslogs.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/student")
public class StudentController {

        private final StudentService studentService;

        @Autowired
        public StudentController(StudentService studentService) {
            this.studentService = studentService;
        }


        @PostMapping()
        public String create(@ModelAttribute("student") @Valid StudentEntity student,
                             BindingResult bindingResult) {
            if (bindingResult.hasErrors())
                return "student/new";

            studentService.createNewStudent(student);
            return "redirect:/student";
        }

        @GetMapping
        public String get(){
            studentService.getAllStudents();
            return "redirect:/student";
        }

        @DeleteMapping("/{id}")
        public String delete(@PathVariable("id") long id) {
            studentService.deleteStudentById(id);
            return "redirect:/student";
        }
}
