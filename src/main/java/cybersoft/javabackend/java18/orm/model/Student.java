package cybersoft.javabackend.java18.orm.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data // @Data includes @Getter, @Setter,...
@Builder // @Builder used to instantiate Student class (create constructors)
@Entity // Mark that Student class represent Student entity in the database
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id // Mark studentId as primary key of Student table
    private int studentId;
    private String name;
}
