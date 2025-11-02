package com.julia.moviemanager.controller;

import com.julia.moviemanager.model.Movie;
import com.julia.moviemanager.service.MovieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {
    private final MovieService service;

    public MovieController(MovieService service){
        this.service = service;
    }

    @PostMapping
    public Movie saveMovie(@RequestBody Movie movie){
        return service.save(movie);
    }

    @GetMapping
    public List<Movie> listAllMovies(){
       return service.listAll();
    }

    @GetMapping("/{id}")
    public Movie findById(@PathVariable Long id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public Movie updateMovie(@PathVariable Long id, @RequestBody Movie updatedMovie){
        return service.updateMovie(id, updatedMovie);
    }

    @DeleteMapping("/{id}")
    public void deleteMovie(@PathVariable Long id){
        service.delete(id);

    }


}
