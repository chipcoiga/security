package click.botay.security.service;

import click.botay.security.domain.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by locle on 13/08/2018.
 */
@Service
public class StudentServiceImpl implements StudentService {

    private static List<Student> students = new ArrayList<>();
    static {
        Student student1 = new Student("name 1", 21, "class 1");
        Student student2 = new Student("name 2", 21, "class 2");
        Student student3 = new Student("name 3", 21, "class 3");

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> retrieveCourses() {
        return students;
    }
}
