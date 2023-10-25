package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Curso;
import com.exercicio1.exercicio1.service.CursoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;

    @GetMapping("/{id}")
    public Curso buscarUm(@PathVariable Integer id){
        return cursoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Curso> buscarTodos(){
        return cursoService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        cursoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }

    @PutMapping
    public void atualizar(@RequestBody Curso curso){
        cursoService.salvar(curso);
    }
}
