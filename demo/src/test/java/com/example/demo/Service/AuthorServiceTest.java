//package com.example.demo.Service;
//
//import com.example.demo.Model.Authors;
//import com.example.demo.Repo.AuthorRepo;
//import org.assertj.core.api.Assertions;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Order;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.test.annotation.Rollback;
//
//import java.util.List;
//import java.util.Optional;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class AuthorServiceTest {
//
//    @Autowired
//    AuthorRepo authorRepo;
//
//    @Test
//    @Order(3)
//    void getAllAuthors() {
//        List<Authors> authors = authorRepo.findAll();
//
//        Assertions.assertThat(authors.size()).isGreaterThan(0);
//
//    }
//
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    void addNewAuthor() {
//        Authors authors = Authors.builder().authorName("Jk").build();
//
//        authorRepo.save(authors);
//        Assertions.assertThat(authors.getAuthorId()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(2)
//    @Rollback(value = false)
//    void updateAuthor() {
//        Authors authors = authorRepo.findById(1L).get();
//        authors.setAuthorName("JK Rowling");
//        Authors updatedAuthor = authorRepo.save(authors);
//        Assertions.assertThat(updatedAuthor.getAuthorName()).isEqualTo("JK Rowling");
//
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    void deleteAuthor() {
//        Authors authors = authorRepo.findById(1L).get();
//        authorRepo.delete(authors);
//        Authors authors1 = null;
//        Optional<Authors> optionalAuthors = authorRepo.findById(1L);
//        if(optionalAuthors.isPresent()){
//            authors1 = optionalAuthors.get();
//        }
//        Assertions.assertThat(authors1).isNull();
//    }
//}