package com.czn.info_service.controller;

import com.czn.info_service.dto.Movie;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class InfoController
{
    @GetMapping("/info/{movieName}")
    public List<Movie> getMovie(@PathVariable String movieName){

        return new ArrayList<Movie>(Arrays.asList(
                new Movie("Rocket singh",2,"lorem50"),
                new Movie("Krish - 3",4,"lorem50")
                ));
    }
}
