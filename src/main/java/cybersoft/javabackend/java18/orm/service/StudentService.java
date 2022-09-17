package cybersoft.javabackend.java18.orm.service;

import cybersoft.javabackend.java18.orm.model.Student;
import cybersoft.javabackend.java18.orm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> findAll();

    Student save(Student student);

    Student update(Student student, int id);

    List<Student> findByName(String name);
    List<Student> findByLetters(String letters);
}