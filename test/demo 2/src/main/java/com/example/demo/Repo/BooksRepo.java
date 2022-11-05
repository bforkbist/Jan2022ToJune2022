package com.example.demo.Repo;

import com.example.demo.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Books, Long> {
}
