package com.projetojava.ordemdecompra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdemDeCompraRepository extends JpaRepository<OrdemDeCompra, String> {
}
