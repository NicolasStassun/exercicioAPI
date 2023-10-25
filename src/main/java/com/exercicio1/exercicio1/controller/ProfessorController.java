package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Aluno;
import com.exercicio1.exercicio1.model.Professor;
import com.exercicio1.exercicio1.model.Usuario;
import com.exercicio1.exercicio1.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/professor")
public class ProfessorController {

    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Professor buscarUm(@PathVariable Integer id){
        return usuarioService.buscarUmProfessor(id);
    }

    @GetMapping
    public Collection<Professor> buscarTodos(){
        return usuarioService.buscarTodosProfessores();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        usuarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Professor professor){
        usuarioService.salvar(professor);
    }

    @PutMapping
    public void atualizar(@RequestBody Professor professor){
        usuarioService.salvar(professor);
    }
}
