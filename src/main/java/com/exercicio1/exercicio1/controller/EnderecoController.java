package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Endereco;
import com.exercicio1.exercicio1.service.EnderecoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    private EnderecoService enderecoService;

    @GetMapping("/{id}")
    public Endereco buscarUm(@PathVariable Integer id){
        return enderecoService.buscarUm(id);
    }

    @GetMapping
    public Collection<Endereco> buscarTodos(){
        return enderecoService.buscarTodos();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        enderecoService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Endereco endereco){
        enderecoService.salvar(endereco);
    }

    @PutMapping
    public void atualizar(@RequestBody Endereco endereco){
        enderecoService.salvar(endereco);
    }
}
