package com.exercicio1.exercicio1.repository;

import com.exercicio1.exercicio1.model.Escola;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EscolaRepository extends JpaRepository<Escola, Integer> {

}
