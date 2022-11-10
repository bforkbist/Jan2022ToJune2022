//package com.example.demo.NewService;
//
//import com.example.demo.Model.Books;
//import com.example.demo.Repo.BooksRepo;
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
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class BooksServiceTest {
//    @Autowired
//    BooksRepo booksRepo;
//
//    @Test
//    @Order(3)
//    void getAllBooks() {
//        List<Books> books = booksRepo.findAll();
//
//        Assertions.assertThat(books.size()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    void addNewBooks() {
//        Books books = Books.builder().
//                bookName("harry potter").
//                bookAuthor("Jk").
//                bookGenres("fiction").
//                build();
//        booksRepo.save(books);
//        Assertions.assertThat(books.getBookId()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(2)
//    @Rollback(value = false)
//    void updateBooks() {
//        Books books = booksRepo.findById(1L).get();
//        books.setBookName("Harry puttar");
//        books.setBookGenres("comedy");
//        books.setBookAuthor("bhardwaj");
//
//        Books updatedBook = booksRepo.save(books);
//
//        Assertions.assertThat(updatedBook.getBookAuthor()).isEqualTo("bhardwaj");
//
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    void deleteBooks() {
//        Books books = booksRepo.findById(1L).get();
//
//        booksRepo.delete(books);
//
//        Books books1 = null;
//        Optional<Books> optionalBooks = booksRepo.findById(1L);
//
//        if(optionalBooks.isPresent()){
//            books1 = optionalBooks.get();
//        }
//        Assertions.assertThat(books1).isNull();
//
//
//    }
//}