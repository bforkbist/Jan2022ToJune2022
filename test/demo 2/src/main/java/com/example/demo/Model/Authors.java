package com.example.demo.Model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "author")
@Getter
@Setter
@NoArgsConstructor
public class Authors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id", nullable = false)
    private Long authorId;

    @Column(name = "author_name")
    private String authorName;

}
