package com.example.demo.Repo;

import com.example.demo.Model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepo extends JpaRepository<Authors, Long> {
}
