package pl.gadzinski.layers.controller;

import pl.gadzinski.layers.model.Student;
import pl.gadzinski.layers.service.StudentService;

import java.util.List;

public class StundetController {
private StudentService studentService;

    public StundetController(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> findAll(){
        return studentService.findAll();
    }
}
