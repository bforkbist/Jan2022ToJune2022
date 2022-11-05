package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Authors;
import com.example.demo.Repo.AuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    AuthorRepo authorRepo;

    @GetMapping("/get")
    public List<Authors> getGenres(){
        return authorRepo.findAll();
    }

    @PostMapping("/add")
    public Authors addGenres(@RequestBody Authors authors){
        authorRepo.save(authors);
        return authors;
    }

    @PutMapping("/update")
    public Authors updateGenres(@RequestBody Authors authors) throws ResourceNotFoundExceptions {
        Authors oldDetails = authorRepo.findById(authors.getAuthorId()).orElseThrow(()-> new ResourceNotFoundExceptions("Author","id",authors.getAuthorId()));

        return authors;
    }

    @DeleteMapping("/delete")
    public void deleteGenre(@RequestParam long id) throws ResourceNotFoundExceptions {
        authorRepo.delete(authorRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Author","id",id)));

    }
}
