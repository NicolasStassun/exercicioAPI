package com.exercicio1.exercicio1.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity

public class Aluno extends Usuario{

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Turma turma;

}
