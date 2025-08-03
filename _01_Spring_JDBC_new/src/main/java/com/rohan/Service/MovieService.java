package com.rohan.Service;

import com.rohan.Dao.MovieDao;
import com.rohan.Model.Movie;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class MovieService {

   // @Autowired
    private MovieDao courseDao;

    public void addCourse(Movie movie) {
        courseDao.addCourse(movie);
    }
    public void deleteCourse(Movie movie) {
        courseDao.deleteCourse(movie);
    }
    public void updateCourse(Movie movie) {
        courseDao.updateCourse(movie);
    }
    public Movie getCourseById(int id) {
        return courseDao.getCourseById(id);
    }
    public List<Movie> getAllCourses() {
        return  courseDao.getAllCourses();
    }
}
