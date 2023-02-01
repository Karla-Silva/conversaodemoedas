package com.projetojava.conversaodemoedas.ordemDeCompra;

import java.math.BigDecimal;

public class ordemDeCompraDTO {
    private String cpf;
    private String moeda; //USD ou EUR
    private BigDecimal valor;
    private String agencia;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMoeda() {
        return moeda;
    }

    public void setMoeda(String moeda) {
        this.moeda = moeda;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
}
