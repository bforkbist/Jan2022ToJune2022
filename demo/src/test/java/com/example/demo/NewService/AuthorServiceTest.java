//package com.example.demo.NewService;
//
//import com.example.demo.Exceptions.ResourceNotFoundExceptions;
//import com.example.demo.Model.Authors;
//import com.example.demo.Repo.AuthorRepo;
//import com.example.demo.Service.AuthorService;
//import org.junit.jupiter.api.MethodOrderer;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.TestMethodOrder;
//import org.junit.runner.RunWith;
//import org.mockito.ArgumentMatchers;
//import org.mockito.InjectMocks;
//import org.mockito.*;
//import org.mockito.junit.MockitoJUnitRunner;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.mockito.BDDMockito.given;
//import static org.mockito.Mockito.verify;
//import static org.mockito.Mockito.when;
//
//@DataJpaTest
//@RunWith(MockitoJUnitRunner.class)
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class AuthorServiceTest {
//
//    @Mock
//    AuthorRepo authorRepo;
//    @InjectMocks
//    AuthorService authorService;
//
//    @Test
//    void getAllAuthors() {
//        List<Authors> authors = new ArrayList<>();
//        authors.add(new Authors());
//        given(authorRepo.findAll()).willReturn(authors);
//        List<Authors> expected = authorService.getAllAuthors();
//        assertEquals(expected, authors);
//        verify(authorRepo).findAll();
//    }
//
//    @Test
//    void addNewAuthor() {
//        Authors authors = Authors.builder().authorName("Jk").build();
//        when(authorRepo.save(ArgumentMatchers.any(Authors.class))).thenReturn(authors);
//        Authors created = authorService.addNewAuthor(authors);
//        assertThat(created.getAuthorName()).isSameAs(authors.getAuthorName());
//        verify(authorRepo).save(authors);
//    }
//
//    @Test
//    void updateAuthor() throws ResourceNotFoundExceptions {
//        Authors authors = new Authors();
//        authors.setAuthorId(89l);
//        authors.setAuthorName("Test Name");
//
//        Authors newAuthors = new Authors();
//        newAuthors.setAuthorId(89l);
//        newAuthors.setAuthorName("New Test Name");
//
//        given(authorRepo.findById(authors.getAuthorId())).willReturn(Optional.of(authors));
//        authorService.updateAuthor(authors.getAuthorId(),newAuthors);
//
//        verify(authorRepo).save(newAuthors);
//        verify(authorRepo).findById(authors.getAuthorId());
//
//    }
//
//    @Test
//    void deleteAuthor() throws ResourceNotFoundExceptions {
//        Authors authors = new Authors();
//        authors.setAuthorId(89l);
//        authors.setAuthorName("Test Name");
//
//
//        when(authorRepo.findById(authors.getAuthorId())).thenReturn(Optional.of(authors));
//        authorService.deleteAuthor(authors.getAuthorId());
//        verify(authorRepo).deleteById(authors.getAuthorId());
//    }
//}