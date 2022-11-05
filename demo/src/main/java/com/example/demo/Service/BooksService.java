package com.example.demo.Service;

import com.example.demo.Exceptions.ResourceNotFoundExceptions;
import com.example.demo.Model.Books;
import com.example.demo.Repo.BooksRepo;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BooksService {
    @Autowired
    BooksRepo booksRepo;

    public List<Books> getAllBooks(){
        return booksRepo.findAll();
    }

    public void addNewBooks(Books books){
        booksRepo.save(books);
    }

    public void updateBooks(Books books) throws ResourceNotFoundExceptions {
        Books oldDetails = booksRepo.findById(books.getBookId()).orElseThrow(()-> new ResourceNotFoundExceptions("Books","id",books.getBookId()));
        oldDetails.setBookName(books.getBookName());
        booksRepo.save(oldDetails);
    }

    public void deleteBooks(long id) throws ResourceNotFoundExceptions{
        Books oldDetails = booksRepo.findById(id).orElseThrow(()-> new ResourceNotFoundExceptions("Books","id",id));
        booksRepo.delete(oldDetails);
    }
}
