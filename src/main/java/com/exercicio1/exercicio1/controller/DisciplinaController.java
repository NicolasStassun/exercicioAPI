package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Disciplina;
import com.exercicio1.exercicio1.service.DisciplinaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/disciplina")
public class DisciplinaController {

    private DisciplinaService disciplinaService;

    @GetMapping("/{id}")
    public Disciplina buscarUm(@PathVariable Integer id){
        return disciplinaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Disciplina> buscarTodos(){
        return disciplinaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        disciplinaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }

    @PutMapping
    public void atualizar(@RequestBody Disciplina disciplina){
        disciplinaService.salvar(disciplina);
    }
}
