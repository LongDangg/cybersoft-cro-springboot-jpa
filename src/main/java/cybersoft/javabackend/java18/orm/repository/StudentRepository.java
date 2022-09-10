package cybersoft.javabackend.java18.orm.repository;

import cybersoft.javabackend.java18.orm.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
