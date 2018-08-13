package click.botay.security.controller;

import click.botay.security.domain.Student;
import click.botay.security.service.StudentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by locle on 13/08/2018.
 */
@RestController
public class LoginController {

    private final StudentService studentService;

    public LoginController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/all")
    public List<Student> getStudents() {
        return studentService.retrieveCourses();
    }

    @GetMapping("/students/{index}")
    public Student getStudentByIndex(@PathVariable int index) {
        return studentService.retrieveCourses().get(index);
    }
}
