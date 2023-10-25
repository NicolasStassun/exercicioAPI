package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Turma;
import com.exercicio1.exercicio1.service.TurmaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/turma")
public class TurmaController {

    private TurmaService turmaService;

    @GetMapping("/{id}")
    public Turma buscarUm(@PathVariable Integer id){
        return turmaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Turma> buscarTodos(){
        return turmaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        turmaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }

    @PutMapping
    public void atualizar(@RequestBody Turma turma){
        turmaService.salvar(turma);
    }
}
