package com.exercicio1.exercicio1.service;

import lombok.AllArgsConstructor;
import com.exercicio1.exercicio1.model.Disciplina;
import org.springframework.stereotype.Service;
import com.exercicio1.exercicio1.repository.DisciplinaRepository;

import java.util.Collection;

@Service
@AllArgsConstructor
public class DisciplinaService {

    private DisciplinaRepository disciplinaRepository;

    public Collection<Disciplina> buscarTodos() {
        return disciplinaRepository.findAll();
    }

    public void deletar(Integer id) {
        disciplinaRepository.deleteById(id);
    }

    public void salvar(Disciplina disciplina) {
        disciplinaRepository.save(disciplina);
    }

    public Disciplina buscarUm(Integer id) {
        return disciplinaRepository.findById(id).get();
    }
}
