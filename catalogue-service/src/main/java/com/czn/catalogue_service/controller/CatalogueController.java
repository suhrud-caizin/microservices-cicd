package com.czn.catalogue_service.controller;

import com.czn.catalogue_service.dto.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.czn.catalogue_service.service.InfoClient;

import java.util.List;

@RestController
@RequestMapping("/catalog")
public class CatalogueController
{
    @Autowired
    InfoClient client;


    @RequestMapping("/{name}")
    public List<Movie> getCatalogue(@PathVariable("name") String name){
        System.out.println("hit!");
        return client.getMovies(name);
    }

//    @GetMapping("/health")
//    public String getHealth(@PathVariable String name){
//        return "working";
//    }
}
