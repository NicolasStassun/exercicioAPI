package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Aluno;
import com.exercicio1.exercicio1.model.Usuario;
import com.exercicio1.exercicio1.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/aluno")
public class AlunoController {

    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Aluno buscarUm(@PathVariable Integer id){
        return usuarioService.buscarUmAluno(id);
    }

    @GetMapping
    public Collection<Aluno> buscarTodos(){
        return usuarioService.buscarTodosAlunos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        usuarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Aluno aluno){
        usuarioService.salvar(aluno);
    }

    @PutMapping
    public void atualizar(@RequestBody Aluno aluno){
        usuarioService.salvar(aluno);
    }
}
