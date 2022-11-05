package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "genres")
@Getter
@Setter
@NoArgsConstructor
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "genres_id", nullable = false)
    private Long genresId;

    @Column(name = "genres_name")
    private String name;
}
