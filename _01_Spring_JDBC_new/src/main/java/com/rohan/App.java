package com.rohan;

import com.rohan.Controller.MovieController;
import com.rohan.Model.Movie;
import com.rohan.config.spring_cofig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new AnnotationConfigApplicationContext(spring_cofig.class);
        MovieController movieController=context.getBean(MovieController.class);

        movieController.updateCourse(Movie.builder()
                .Id(11)
                .description("this is love story")
                .title("ye jawani hain deewani")
                .Year("2012")
                .build());   //adding Movie

        System.out.println( "done...." );
    }
}
