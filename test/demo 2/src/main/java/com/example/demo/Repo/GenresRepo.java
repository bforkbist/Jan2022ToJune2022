package com.example.demo.Repo;

import com.example.demo.Model.Genres;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenresRepo extends JpaRepository<Genres,Long> {
}
