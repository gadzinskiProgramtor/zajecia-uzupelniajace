package pl.gadzinski.layers.repository;

import pl.gadzinski.layers.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentInMemoryRepository implements StudentRepository {

    private List<Student> students;

    public StudentInMemoryRepository() {
        this.students = new ArrayList<>();
    }

    public List<Student> findAll() {
        return new ArrayList<>(this.students);
    }

    public Student findById(Long id) {
        return null;
    }

    public void save(Student student) {

    }
}
