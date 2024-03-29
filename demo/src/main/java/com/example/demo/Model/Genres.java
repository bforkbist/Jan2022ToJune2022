package com.example.demo.Model;

import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
//@Table(name = "genres")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genres_id", nullable = false)
    private Long genresId;

    @Column(name = "genres_name")
    private String genresName;

//    @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy = "genres")
//    private Set<Books> books = new HashSet<Books>();
}
