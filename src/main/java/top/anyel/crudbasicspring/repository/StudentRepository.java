package top.anyel.crudbasicspring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import top.anyel.crudbasicspring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
