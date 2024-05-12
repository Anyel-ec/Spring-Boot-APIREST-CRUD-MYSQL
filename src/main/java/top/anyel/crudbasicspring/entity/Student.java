package top.anyel.crudbasicspring.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data // Lombok annotation to generate getters and setters
@Entity // JPA annotation to make this class an entity
public class Student {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id_student; // is recommended to use long

    private String name;

    @Column(unique = true, nullable = false) // JPA annotation to make this field unique
    private String email;

    private String phone;


}
