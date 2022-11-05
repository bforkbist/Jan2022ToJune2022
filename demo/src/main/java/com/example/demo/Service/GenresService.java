package com.example.demo.Service;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Genres;
import com.example.demo.Repo.GenresRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenresService {
    @Autowired
    GenresRepo genresRepo;

    public List<Genres> getAllGenres(){
        return genresRepo.findAll();
    }

    public void addNewGenres(Genres genres){
        genresRepo.save(genres);
    }

    public void updateGenres(Genres genres) throws ResourceNotFoundExceptions {
        Genres oldDetails = genresRepo.findById(genres.getGenresId()).orElseThrow(()-> new ResourceNotFoundExceptions("Genres","id",genres.getGenresId()));
        oldDetails.setGenresName(genres.getGenresName());
        genresRepo.save(oldDetails);
    }

    public void deleteGenres(long id) throws ResourceNotFoundExceptions{
        Genres oldDetails = genresRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Genres","id",id));
        genresRepo.delete(oldDetails);
    }
}
