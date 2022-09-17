package cybersoft.javabackend.java18.orm.resource;

import cybersoft.javabackend.java18.orm.model.Student;
import cybersoft.javabackend.java18.orm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentResource {
    private StudentService service;

    @Autowired // Dependency injection by constructor is recommended
    public StudentResource(StudentService studentService){
        service = studentService;
    }

    @GetMapping
    public ResponseEntity<Object> getAllStudent(){
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/by-name")
    public ResponseEntity<Object> findByName(@RequestParam("name") String name){
        return new ResponseEntity<>(service.findByName(name), HttpStatus.OK);
    }

    @GetMapping("/by-letters")
    public ResponseEntity<Object> findByLetters(@RequestParam("letters") String letters){
        return new ResponseEntity<>(service.findByLetters(letters), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Object> createNewStudent(@RequestBody Student student){
        return new ResponseEntity<>(service.save(student), HttpStatus.CREATED);
    }
}
