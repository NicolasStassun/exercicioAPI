package com.exercicio1.exercicio1.service;

import com.exercicio1.exercicio1.model.Escola;
import com.exercicio1.exercicio1.repository.EscolaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.Collection;

@Service
@AllArgsConstructor
public class EscolaService {

    private EscolaRepository escolaRepository;

    public Collection<Escola> buscarTodos() {
        return escolaRepository.findAll();
    }

    public void deletar(Integer id) {
        escolaRepository.deleteById(id);
    }

    public void salvar(Escola escola) {
        escolaRepository.save(escola);
    }

    public Escola buscarUm(Integer id) {
        return escolaRepository.findById(id).get();
    }
}
