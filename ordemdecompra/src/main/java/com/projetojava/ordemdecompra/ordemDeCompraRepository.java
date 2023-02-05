package com.projetojava.ordemdecompra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ordemDeCompraRepository extends JpaRepository<ordemDeCompra, String> {
}
