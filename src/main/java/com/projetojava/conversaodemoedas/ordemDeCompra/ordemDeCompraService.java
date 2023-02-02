package com.projetojava.conversaodemoedas.ordemDeCompra;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ordemDeCompraService {
    private final CrudRepository<ordemDeCompra, String> repository;

    public void salvarOrdemDeCompra(ordemDeCompra ordemDeCompra) {
        repository.save(ordemDeCompra);
    }
}
