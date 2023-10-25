package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Escola;
import com.exercicio1.exercicio1.service.EscolaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/escola")
public class EscolaController {

    private EscolaService escolaService;

    @GetMapping("/{id}")
    public Escola buscarUm(@PathVariable Integer id){
        return escolaService.buscarUm(id);
    }

    @GetMapping
    public Collection<Escola> buscarTodos(){
        return escolaService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        escolaService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }

    @PutMapping
    public void atualizar(@RequestBody Escola escola){
        escolaService.salvar(escola);
    }
}
