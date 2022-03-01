package com.example.tp1.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;


@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Projet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProjet;

    @Column(nullable = false,length = 20)
    private String nom;

    @Column
    private Date duree;

    @OneToMany(mappedBy = "samy", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Collection<Employee> employees;
}
