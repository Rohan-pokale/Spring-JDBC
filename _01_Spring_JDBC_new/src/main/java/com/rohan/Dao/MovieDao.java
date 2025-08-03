package com.rohan.Dao;

import com.rohan.Model.Movie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@AllArgsConstructor
@Repository
public class MovieDao {

   // @Autowired
    JdbcTemplate jdbcTemplate;

    public void addCourse(Movie movie) {
        String sql = "INSERT INTO movie (Id, Year, des, title) VALUES (?, ?, ?, ?)";
        jdbcTemplate.update(sql, movie.getId(), movie.getYear(), movie.getDescription(), movie.getTitle());
        System.out.println("Movie added successfully: " + movie);
    }
    public void deleteCourse(Movie movie) {
        String sql = "DELETE FROM movie WHERE Id = ?";
        jdbcTemplate.update(sql, movie.getId());
        System.out.println("Movie deleted successfully: " + movie);
    }
    public void updateCourse(Movie movie) {
        String sql = "update movie set Year = ?, des = ?, title = ? where Id = ?";
        jdbcTemplate.update(sql, movie.getYear(), movie.getDescription(), movie.getTitle(), movie.getId());
        System.out.println("Movie updated successfully: " + movie);
    }
    public Movie getCourseById(int id) {
        String sql = "SELECT * FROM movie WHERE Id = ?";
        return null;
    }
    public List<Movie> getAllCourses() {
        return  null;
    }
}
