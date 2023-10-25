package com.exercicio1.exercicio1.repository;

import com.exercicio1.exercicio1.model.Turma;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Integer> {

}
