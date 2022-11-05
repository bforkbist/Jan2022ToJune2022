package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Books;
import com.example.demo.Service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    BooksService bookService = new BooksService();

    @GetMapping("/get")
    public List<Books> getBooks(){
        return bookService.getAllBooks();
    }

    @PostMapping("/add")
    public String addBooks(@RequestBody Books books){
        bookService.addNewBooks(books);
        return "book created";
    }

    @PutMapping("/update")
    public String updateBooks(@RequestBody Books books) throws ResourceNotFoundExceptions {
        bookService.updateBooks(books);
        return "book updated";
    }

    @DeleteMapping("/delete")
    public String deleteBooks(@RequestBody long id) throws ResourceNotFoundExceptions {
        bookService.deleteBooks(id);
        return "book "+id+" deleted";
    }
}
