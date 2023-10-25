package com.exercicio1.exercicio1.service;

import com.exercicio1.exercicio1.model.Aluno;
import com.exercicio1.exercicio1.model.Diretor;
import com.exercicio1.exercicio1.model.Professor;
import lombok.AllArgsConstructor;
import com.exercicio1.exercicio1.model.Usuario;
import org.springframework.stereotype.Service;
import com.exercicio1.exercicio1.repository.UsuarioRepository;

import java.util.*;

@Service
@AllArgsConstructor

public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public Collection<Usuario> buscarTodos(){
        return usuarioRepository.findAll();
    }

    public void deletar(Integer id){
        usuarioRepository.deleteById(id);
    }

    public void salvar(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public Usuario buscarUm(Integer id) {
        return usuarioRepository.findById(id).get();
    }
    public Aluno buscarUmAluno(Integer id){
        if (usuarioRepository.findById(id).get() instanceof Aluno){
            return (Aluno) usuarioRepository.findById(id).get();
        }
        return null;
    }
    public Professor buscarUmProfessor(Integer id){
        if (usuarioRepository.findById(id).get() instanceof Professor){
            return (Professor) usuarioRepository.findById(id).get();
        }
        return null;
    }
    public Diretor buscarUmDiretor(Integer id){
        if (usuarioRepository.findById(id).get() instanceof Diretor){
            return (Diretor) usuarioRepository.findById(id).get();
        }
        return null;
    }
    public Collection<Aluno> buscarTodosAlunos(){
        Collection<Aluno> alunos = new ArrayList<>();
        for (Usuario usuario:
        usuarioRepository.findAll()) {
            if(usuario instanceof Aluno){
                alunos.add((Aluno) usuario);
            }
        }
        if (alunos != null){
            return alunos;
        }
        else {
            return null;
        }
    }
    public Collection<Professor> buscarTodosProfessores(){
        Collection<Professor> alunos = new ArrayList<>();
        for (Usuario usuario:
                usuarioRepository.findAll()) {
            if(usuario instanceof Professor){
                alunos.add((Professor) usuario);
            }
        }
        if (alunos != null){
            return alunos;
        }
        else {
            return null;
        }
    }
    public Collection<Diretor> buscarTodosDiretores(){
        Collection<Diretor> alunos = new ArrayList<>();
        for (Usuario usuario:
                usuarioRepository.findAll()) {
            if(usuario instanceof Diretor){
                alunos.add((Diretor) usuario);
            }
        }
        if (alunos != null){
            return alunos;
        }
        else {
            return null;
        }
    }

}
