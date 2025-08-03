package com.rohan;

import com.rohan.Controller.CourseController;
import com.rohan.Model.Student;
import com.rohan.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class StudentApp {
    public static void main(String[] args) {

        ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
        CourseController courseController=context.getBean(CourseController.class);

        //adding student......
//        Student student= Student.builder().name("sopan").age(23).build();
//        courseController.addStudent(student);

        //Updating student......
//        Student student= Student.builder().id(1).name("sopan").age(23).build();
//        courseController.updateStudent(student);

        //delete data by id
//        Student student= Student.builder().id(1).build();
//        courseController.deleteStudent(student);

        //get data by id
        Student studentData=courseController.getDataById(1);
        System.out.println(studentData);


    }
}
