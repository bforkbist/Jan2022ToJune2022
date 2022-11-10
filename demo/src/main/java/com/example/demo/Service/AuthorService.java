package com.example.demo.Service;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Authors;
import com.example.demo.Repo.AuthorRepo;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    AuthorRepo authorRepo;

    public List<Authors> getAllAuthors(){
        return authorRepo.findAll();
    }

    public Authors addNewAuthor(Authors authors){
        authorRepo.save(authors);
        return authors;
    }

    public void updateAuthor(Long authorId, @NotNull Authors author) throws ResourceNotFoundExceptions {
        Authors oldDetails = authorRepo.findById(authorId).orElseThrow(()-> new ResourceNotFoundExceptions("Author","id",author.getAuthorId()));
        oldDetails.setAuthorName(author.getAuthorName());
        authorRepo.save(oldDetails);
    }

    public void deleteAuthor(long id) throws ResourceNotFoundExceptions{
        Authors oldDetails = authorRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Author","id",id));
        authorRepo.deleteById(id);
    }

}
