package top.anyel.crudbasicspring.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.anyel.crudbasicspring.entity.Student;
import top.anyel.crudbasicspring.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired // Injecting the StudentRepository

    private StudentRepository studentRepository; // instance of StudentRepository

    // list of service
    public List<Student> listStudentAll() {
        return studentRepository.findAll(); // return all students
    }

    public Optional<Student> getStudent(Long id) {
        return studentRepository.findById(id); // return student by id
    }

    public void saveStudent(Student student) {
        studentRepository.save(student); // save student
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id); // delete student by id
    }

    public void updateStudent(Student student) {
        studentRepository.save(student); // update student
    }

}