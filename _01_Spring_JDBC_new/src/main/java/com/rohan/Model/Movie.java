package com.rohan.Model;


import lombok.*;
import lombok.experimental.Tolerate;

@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
@Builder
public class Movie {
    private  int Id;
    private String Year;
    private  String description;
    private String title;
}
