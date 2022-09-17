package cybersoft.javabackend.java18.orm.service;

import cybersoft.javabackend.java18.orm.model.Student;
import cybersoft.javabackend.java18.orm.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

//import javax.transaction.Transactional;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository repository;
    @Override
    @Transactional(readOnly=true)
    public List<Student> findAll() {
        return repository.findAll();
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    @Transactional
    public Student update(Student student, int id) {
        Student pStudent = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student does not exist"));
        pStudent.setName(student.getName());
        return pStudent;
    }

    @Override
    public List<Student> findByName(String name) {
        return repository.findByName(name);
    }

    @Override
    public List<Student> findByLetters(String letters) {
        return repository.findByContainLetter(letters);
    }


}
