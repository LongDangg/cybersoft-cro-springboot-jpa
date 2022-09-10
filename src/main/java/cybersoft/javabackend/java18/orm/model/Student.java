package cybersoft.javabackend.java18.orm.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity // Mark that Student class represent Student entity in the database
public class Student {
    @Id // Mark studentId as primary key of Student table
    private int studentId;
    private String name;
}
