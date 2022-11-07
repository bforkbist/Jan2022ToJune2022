package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Table(name = "books")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", nullable = false)
    private Long bookId;

    @Column(name = "book_name")
    private String bookName;

    @Column(name = "book_author")
    private String bookAuthor;

    @Column(name = "book_genres")
    private String bookGenres;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
//    @JoinTable(name = "authors", joinColumns = { @JoinColumn(name = "book_id") }, inverseJoinColumns = {
//            @JoinColumn(name = "author_id") })
//    private Set<Authors> authors = new HashSet<Authors>();
//
//    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })
//    @JoinTable(name = "genres", joinColumns = { @JoinColumn(name = "book_id") },  inverseJoinColumns = {
//            @JoinColumn(name = "genres_id") })
//    private Set<Genres> genres = new HashSet<Genres>();

}
