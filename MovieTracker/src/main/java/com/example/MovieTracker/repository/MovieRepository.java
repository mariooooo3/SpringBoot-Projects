package com.example.MovieTracker.repository;

import com.example.MovieTracker.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}