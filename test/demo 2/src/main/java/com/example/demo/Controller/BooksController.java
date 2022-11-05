package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Books;
import com.example.demo.Repo.BooksRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    BooksRepo bookRepo;

    @GetMapping("/get")
    public List<Books> getGenres(){
        return bookRepo.findAll();
    }

    @PostMapping("/add")
    public Books addGenres(@RequestBody Books books){
        bookRepo.save(books);
        return books;
    }

    @PutMapping("/update")
    public Books updateGenres(@RequestBody Books books) throws ResourceNotFoundExceptions {
        Books oldDetails = bookRepo.findById(books.getBookId()).orElseThrow(()-> new ResourceNotFoundExceptions("Book","id",books.getBookId()));

        return books;
    }

    @DeleteMapping("/delete")
    public void deleteGenre(@RequestParam long id) throws ResourceNotFoundExceptions {
        bookRepo.delete(bookRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Book","id",id)));

    }
}
