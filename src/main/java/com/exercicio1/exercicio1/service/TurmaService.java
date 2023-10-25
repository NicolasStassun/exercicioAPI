package com.exercicio1.exercicio1.service;

import lombok.AllArgsConstructor;
import com.exercicio1.exercicio1.model.Turma;
import org.springframework.stereotype.Service;
import com.exercicio1.exercicio1.repository.TurmaRepository;

import java.util.Collection;

@Service
@AllArgsConstructor
public class TurmaService {

    private TurmaRepository turmaRepository;

    public Collection<Turma> buscarTodos() {
        return turmaRepository.findAll();
    }

    public void deletar(Integer id) {
        turmaRepository.deleteById(id);
    }

    public void salvar(Turma turma) {
        turmaRepository.save(turma);
    }

    public Turma buscarUm(Integer id) {
        return turmaRepository.findById(id).get();
    }
}
