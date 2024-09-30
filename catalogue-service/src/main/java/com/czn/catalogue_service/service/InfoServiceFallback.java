package com.czn.catalogue_service.service;
import com.czn.catalogue_service.dto.Movie;
import org.springframework.stereotype.Component;

import java.util.List;



@Component
public class InfoServiceFallback implements InfoClient {
    @Override
    public List<Movie> getMovies(String name) {
        System.out.println("Info service is down!!");
        return null;
    }
}
