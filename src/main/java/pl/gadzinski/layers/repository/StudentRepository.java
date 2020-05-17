package pl.gadzinski.layers.repository;

import pl.gadzinski.layers.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> findAll();
    Student findById(Long id);
    void save(Student student);

}
