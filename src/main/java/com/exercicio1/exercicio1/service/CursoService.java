package com.exercicio1.exercicio1.service;

import lombok.AllArgsConstructor;
import com.exercicio1.exercicio1.model.Curso;
import org.springframework.stereotype.Service;
import com.exercicio1.exercicio1.repository.CursoRepository;

import java.util.Collection;

@Service
@AllArgsConstructor
public class CursoService {

    private CursoRepository cursoRepository;

    public Collection<Curso> buscarTodos() {
        return cursoRepository.findAll();
    }

    public void deletar(Integer id) {
        cursoRepository.deleteById(id);
    }

    public void salvar(Curso curso) {
        cursoRepository.save(curso);
    }

    public Curso buscarUm(Integer id) {
        return cursoRepository.findById(id).get();
    }
}
