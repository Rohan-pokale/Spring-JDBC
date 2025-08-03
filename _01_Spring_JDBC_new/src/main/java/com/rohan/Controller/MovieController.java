package com.rohan.Controller;

import com.rohan.Model.Movie;
import com.rohan.Service.MovieService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@AllArgsConstructor
@Controller
public class MovieController {

   // @Autowired
    private MovieService courseService;

    public void addCourse(Movie movie) {
        courseService.addCourse(movie);
    }
    public void deleteCourse(Movie movie) {
        courseService.deleteCourse(movie);
    }
    public void updateCourse(Movie movie) {
        courseService.updateCourse(movie);
    }
    public Movie getCourseById(int id) {
        return courseService.getCourseById(id);
    }
    public List<Movie> getAllCourses() {
        return  courseService.getAllCourses();
    }
}
