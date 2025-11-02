package com.julia.moviemanager.service;

import com.julia.moviemanager.model.Movie;
import com.julia.moviemanager.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    private final MovieRepository repository;

    public MovieService(MovieRepository repository) {
        this.repository = repository;
    }

    public Movie save(Movie movie){
        return repository.save(movie);
    }

    public List<Movie> listAll(){
        return repository.findAll();
    }

    public Movie findById(Long id){
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filme não encontrado"));
    }

    public Movie updateMovie(Long id, Movie updatedMovie){
        Movie existingMovie = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Filme não encontrado"));

            existingMovie.setTitle(updatedMovie.getTitle());
            existingMovie.setReleaseYear(updatedMovie.getReleaseYear());
            existingMovie.setGenre(updatedMovie.getGenre());
            existingMovie.setWatched(updatedMovie.getWatched());

            return repository.save(existingMovie);
        }

    public void delete(Long id){
        Movie existing = repository.findById(id).orElseThrow(() -> new RuntimeException("Filme não encontrado"));
        repository.delete(existing);
    }

}