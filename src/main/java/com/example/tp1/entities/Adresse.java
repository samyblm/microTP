package com.example.tp1.entities;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;


@Embeddable
@Data @AllArgsConstructor  @NoArgsConstructor
public class Adresse implements Serializable {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY )
//    private Long idAdresse;

    private String rue;
    private Integer numero;
    private String  ville;


}