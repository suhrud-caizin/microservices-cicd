package com.czn.catalogue_service.service;

import com.czn.catalogue_service.dto.Movie;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "info-service", fallback = InfoServiceFallback.class)
public interface InfoClient {
    @RequestMapping(method = RequestMethod.GET, value = "/info/{movieName}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    List<Movie> getMovies(@PathVariable("movieName") String name);

}
