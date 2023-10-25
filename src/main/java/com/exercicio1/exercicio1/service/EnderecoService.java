package com.exercicio1.exercicio1.service;

import lombok.AllArgsConstructor;
import com.exercicio1.exercicio1.model.Endereco;
import org.springframework.stereotype.Service;
import com.exercicio1.exercicio1.repository.EnderecoRepository;

import java.util.Collection;

@Service
@AllArgsConstructor
public class EnderecoService {

    private EnderecoRepository enderecoRepository;

    public Collection<Endereco> buscarTodos() {
        return enderecoRepository.findAll();
    }

    public void deletar(Integer id) {
        enderecoRepository.deleteById(id);
    }

    public void salvar(Endereco endereco) {
        enderecoRepository.save(endereco);
    }

    public Endereco buscarUm(Integer id) {
        return enderecoRepository.findById(id).get();
    }
}
