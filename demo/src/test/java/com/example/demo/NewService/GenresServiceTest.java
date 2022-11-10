//package com.example.demo.NewService;
//
//import com.example.demo.Model.Genres;
//import com.example.demo.Repo.GenresRepo;
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
//
//@DataJpaTest
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//class GenresServiceTest {
//
//    @Autowired
//    GenresRepo genresRepo;
//
//    @Test
//    @Order(2)
//    void getAllGenres() {
//        List<Genres> genres = genresRepo.findAll();
//
//        Assertions.assertThat(genres.size()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(1)
//    @Rollback(value = false)
//    void addNewGenres() {
//        Genres genres = Genres.builder().genresName("action").build();
//        genresRepo.save(genres);
//        Assertions.assertThat(genres.getGenresId()).isGreaterThan(0);
//    }
//
//    @Test
//    @Order(3)
//    @Rollback(value = false)
//    void updateGenres() {
//
//        Genres genres = genresRepo.findById(1L).get();
//
//        genres.setGenresName("acction");
//
//        Genres genresUpdated =  genresRepo.save(genres);
//
//        Assertions.assertThat(genresUpdated.getGenresName()).isEqualTo("acction");
//    }
//
//    @Test
//    @Order(4)
//    @Rollback(value = false)
//    void deleteGenres() {
//        Genres genres = genresRepo.findById(1L).get();
//
//        genresRepo.delete(genres);
//
//        //genresRepository.deleteById(1L);
//
//        Genres genres1 = null;
//        Optional<Genres> optionalGenres = genresRepo.findById(1L);
//
//        if(optionalGenres.isPresent()){
//            genres1 = optionalGenres.get();
//        }
//        Assertions.assertThat(genres1).isNull();
//    }
//}