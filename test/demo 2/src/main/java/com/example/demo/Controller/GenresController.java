package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Genres;
import com.example.demo.Model.Genres;
import com.example.demo.Repo.GenresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenresController {

    @Autowired
    GenresRepo genreRepo;

    @GetMapping("/get")
    public List<Genres> getGenres(){
        return genreRepo.findAll();
    }

    @PostMapping("/add")
    public Genres addGenres(@RequestBody Genres genres){
        genreRepo.save(genres);
        return genres;
    }

    @PutMapping("/update")
    public Genres updateGenres(@RequestBody Genres genres) throws ResourceNotFoundExceptions {
        Genres oldDetails = genreRepo.findById(genres.getGenresId()).orElseThrow(()-> new ResourceNotFoundExceptions("Genre","id",genres.getGenresId()));

        return genres;
    }

    @DeleteMapping("/delete")
    public void deleteGenre(@RequestParam long id) throws ResourceNotFoundExceptions {
        genreRepo.delete(genreRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Genre","id",id)));

    }
}
