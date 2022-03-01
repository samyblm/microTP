package com.example.tp1.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;
import java.util.List;


@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmployee;

    @Column(nullable = false,length = 20)
    private String nom;

    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private Date date;

    @Column(unique = true)
    private String email;

    @ElementCollection
    private List<Adresse> adresse;

    @ManyToOne()
    @JoinColumn(name = "idDepartement")
    private Departement departement;

    @ManyToOne
    @JoinColumn(name = "idProjet")
    private Projet projet;

    @ManyToOne
    @JoinColumn(name = "sam_id_departement")
    private Departement sam;

    @ManyToOne
    @JoinColumn(name = "samy_id_projet")
    private Projet samy;

    public Projet getSamy() {
        return samy;
    }

    public void setSamy(Projet samy) {
        this.samy = samy;
    }

    public Departement getSam() {
        return sam;
    }

    public void setSam(Departement sam) {
        this.sam = sam;
    }
}
