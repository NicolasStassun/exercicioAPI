package com.exercicio1.exercicio1.controller;

import com.exercicio1.exercicio1.model.Diretor;
import com.exercicio1.exercicio1.model.Usuario;
import com.exercicio1.exercicio1.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@AllArgsConstructor
@RestController
@RequestMapping("/diretor")
public class DiretorController {

    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public Diretor buscarUm(@PathVariable Integer id){
        return usuarioService.buscarUmDiretor(id);
    }

    @GetMapping
    public Collection<Diretor> buscarTodos(){
        return usuarioService.buscarTodosDiretores();
    }

    @DeleteMapping
    public void deletar(@RequestParam Integer id){
        usuarioService.deletar(id);
    }

    @PostMapping
    public void inserir(@RequestBody Diretor diretor){
        usuarioService.salvar(diretor);
    }

    @PutMapping
    public void atualizar(@RequestBody Diretor diretor){
        usuarioService.salvar(diretor);
    }
}
