package com.example.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private Long idDepartement;

    @Column(nullable = false,length = 20)
    private String nom;

    @OneToMany(mappedBy = "sam", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Collection<Employee> employees;


}
