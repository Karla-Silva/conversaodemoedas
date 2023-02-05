package com.projetojava.ordemdecompra;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ordemDeCompraDTO {
    private String cpf;
    private String moeda; //USD ou EUR
    private BigDecimal valor;
    private String agencia;

    public ordemDeCompra toEntity(){
        ordemDeCompra novaOrdemDeCompra = new ordemDeCompra();
        novaOrdemDeCompra.setCpf(cpf);
        novaOrdemDeCompra.setAgencia(agencia);
        novaOrdemDeCompra.setMoeda(moeda);
        novaOrdemDeCompra.setValor(valor);
        return novaOrdemDeCompra;
    }
}
