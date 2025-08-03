package com.rohan.Dao;

import com.rohan.Model.Student;
import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@Repository
public class StudentDao {
    JdbcTemplate jdbcTemplate ;
    Environment environment;

    //adding student data
    public void addStudent(Student student){
        String sql="insert into student1(name,age) values(?,?)";
//        jdbcTemplate.update(sql,student.getName(),student.getAge());
        PreparedStatementSetter preparedStatementSetter=pass->{
            pass.setString(1, student.getName());
            pass.setInt(2, student.getAge());
        };
        jdbcTemplate.update(sql,preparedStatementSetter);

        System.out.println("Student data added....");
    }

    //updating student data by id
    public void updateStudent(Student student){
        String sql="update student1 set name=?,age=? where id=? ";
//        jdbcTemplate.update(sql,student.getName(),student.getAge());
        PreparedStatementSetter preparedStatementSetter=pass->{
            pass.setString(1, student.getName());
            pass.setInt(2, student.getAge());
            pass.setInt(3, student.getId());
        };
        jdbcTemplate.update(sql,preparedStatementSetter);

        System.out.println("Student data updated ....");
    }

    public void deleteStudent(Student student) {

        String sql="delete from student1 where id=?";
//        jdbcTemplate.update(sql,student.getName(),student.getAge());
        PreparedStatementSetter preparedStatementSetter=pass->{
            pass.setInt(1, student.getId());
        };
        jdbcTemplate.update(sql,preparedStatementSetter);

        System.out.println("Student data deleted....");

    }

    public Student getDataById(int id) {
        String sql="select * from student1 where id="+id;
        Student student=jdbcTemplate.queryForObject(sql, Student.class);
        return  student;
    }

    //deleting student by id


}
