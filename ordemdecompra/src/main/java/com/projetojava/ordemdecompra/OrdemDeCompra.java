package com.projetojava.ordemdecompra;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import java.math.BigDecimal;

@Entity
@Data
public class OrdemDeCompra {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cpf;
    private String moeda; //USD ou EUR
    private BigDecimal valor;
    private String agencia;

}
