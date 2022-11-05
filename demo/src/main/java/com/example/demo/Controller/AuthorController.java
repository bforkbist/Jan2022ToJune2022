package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Authors;
import com.example.demo.Repo.AuthorRepo;
import com.example.demo.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorService authorService = new AuthorService();

    @GetMapping("/get")
    public List<Authors> getGenres(){
        return authorService.getAllAuthors();
    }

    @PostMapping("/add")
    public String addGenres(@RequestBody Authors authors){
        authorService.addNewAuthor(authors);
        return "author created";
    }

    @PutMapping("/update")
    public String updateGenres(@RequestBody Authors authors) throws ResourceNotFoundExceptions {
        authorService.updateAuthor(authors);
        return "author updated";
    }

    @DeleteMapping("/delete")
    public String deleteGenre(@RequestParam long id) throws ResourceNotFoundExceptions {
        authorService.deleteAuthor(id);
        return "author "+id+" deleted";
    }
}
