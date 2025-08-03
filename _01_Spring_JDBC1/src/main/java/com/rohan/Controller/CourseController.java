package com.rohan.Controller;

import com.rohan.Model.Student;
import com.rohan.Services.StudentSerrvices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@AllArgsConstructor
@Controller
public class CourseController {

    StudentSerrvices studentSerrvices;

    public void addStudent(Student student)
    {
        studentSerrvices.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentSerrvices.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentSerrvices.deleteStudent(student);
    }

    public Student getDataById(int id) {
        return  studentSerrvices.getDataById(id);
    }
}
