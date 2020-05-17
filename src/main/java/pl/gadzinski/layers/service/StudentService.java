package pl.gadzinski.layers.service;

import pl.gadzinski.layers.model.Student;
import pl.gadzinski.layers.repository.StudentRepository;

import java.util.List;

public class StudentService {
    public StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
