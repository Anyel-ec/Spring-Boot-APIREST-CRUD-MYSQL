package top.anyel.crudbasicspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import top.anyel.crudbasicspring.entity.Student;
import top.anyel.crudbasicspring.service.StudentService.StudentService;

import java.util.List;
import java.util.Optional;

@RestController // Spring annotation to make this class a controller
@RequestMapping("/api/v1/student") // URL to access this controller
public class StudentController {

    @Autowired // Injecting the StudentService
    private StudentService studentService; // instance of StudentService



    @GetMapping //URL to list all students
    public List<Student> listStudentAll() {
       return studentService.listStudentAll();
    }

    @PostMapping ("/save") //URL to save a student
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @PostMapping ("/update")//URL to save a student
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping ("/{id_student}")  //URL to delete a student
    public void deleteStudent(@PathVariable Long id_student) {
        studentService.deleteStudent(id_student);
    }

    @GetMapping("/{id_student}") // URL to get a student
    public Optional<Student> getStudent(@PathVariable Long id_student) {
        return studentService.getStudent(id_student);
    }

}

