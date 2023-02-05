package com.projetojava.ordemdecompra;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class OrdemDeCompraDTO {
    private String cpf;
    private String moeda; //USD ou EUR
    private BigDecimal valor;
    private String agencia;

    public OrdemDeCompra toEntity(){
        OrdemDeCompra novaOrdemDeCompra = new OrdemDeCompra();
        novaOrdemDeCompra.setCpf(cpf);
        novaOrdemDeCompra.setAgencia(agencia);
        novaOrdemDeCompra.setMoeda(moeda);
        novaOrdemDeCompra.setValor(valor);
        return novaOrdemDeCompra;
    }
}
