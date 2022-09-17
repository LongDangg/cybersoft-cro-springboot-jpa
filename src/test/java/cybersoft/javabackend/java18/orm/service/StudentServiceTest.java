package cybersoft.javabackend.java18.orm.service;

import cybersoft.javabackend.java18.orm.model.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
public class StudentServiceTest {
    @Autowired
    private StudentService serviceTest;

    @Test
    void shouldSaveStudent(){
        serviceTest.save(Student.builder()
                .studentId(123456)
                .name("Long")
                .build());
    }
}
