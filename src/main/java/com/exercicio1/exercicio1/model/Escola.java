package com.exercicio1.exercicio1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;
    private String email;
    @OneToMany(mappedBy = "escola", cascade = CascadeType.PERSIST)
    private List<Professor> listaDeProfessores;
    @OneToMany(cascade = CascadeType.PERSIST)
    private List<Curso> listaDeCursos;
    @JsonIgnore
    @OneToOne(mappedBy = "escola", cascade = CascadeType.PERSIST)
    private Diretor diretor;


}
