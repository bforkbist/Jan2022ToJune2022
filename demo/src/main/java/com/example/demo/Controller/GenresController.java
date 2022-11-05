package com.example.demo.Controller;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Genres;
import com.example.demo.Service.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/genres")
public class GenresController {

    @Autowired
    GenresService genresService = new GenresService();

    @GetMapping("/get")
    public List<Genres> getGenres(){
        return genresService.getAllGenres();
    }

    @PostMapping("/add")
    public String addGenres(@RequestBody Genres genres){
        genresService.addNewGenres(genres);
        return "Genres created";
    }

    @PutMapping("/update")
    public String updateGenres(@RequestBody Genres genres) throws ResourceNotFoundExceptions {
        genresService.updateGenres(genres);
        return "Genres updated";
    }

    @DeleteMapping("/delete")
    public String deleteGenre(@RequestBody long id) throws ResourceNotFoundExceptions {
        genresService.deleteGenres(id);
        return "Genres "+id+" deleted";
    }
}
