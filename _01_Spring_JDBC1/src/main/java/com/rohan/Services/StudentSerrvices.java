package com.rohan.Services;

import com.rohan.Dao.StudentDao;
import com.rohan.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//@AllArgsConstructor
@Service
public class StudentSerrvices {

    @Autowired
    StudentDao studentDao;
    public  void addStudent(Student student){
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public void deleteStudent(Student student) {
        studentDao.deleteStudent(student);
    }

    public Student getDataById(int id) {
        return studentDao.getDataById(id);
    }
}
