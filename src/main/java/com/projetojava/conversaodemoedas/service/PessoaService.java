package com.projetojava.conversaodemoedas.service;

import com.projetojava.conversaodemoedas.model.Pessoa;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PessoaService {
    private final CrudRepository<Pessoa, String> repository;

    public Optional<Pessoa> getByCpf(String cpf) {
        return repository.findById(cpf);
    }

    public void adicionar(Pessoa entity) {
        repository.save(entity);
    }
}
