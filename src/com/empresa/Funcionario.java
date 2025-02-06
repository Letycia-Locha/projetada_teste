package com.empresa;

import java.math.BigDecimal;

public class Funcionario extends Pessoa {
    private BigDecimal salario;
    private String funcao;

    public Funcionario(String nome, java.time.LocalDate dataNascimento, BigDecimal salario, String funcao) {
        super(nome, dataNascimento);
        this.salario = salario;
        this.funcao = funcao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void aumentarSalario() {
        BigDecimal aumento = salario.multiply(new BigDecimal("0.10"));
        this.salario = salario.add(aumento);
    }

    public String getFuncao() {
        return funcao;
    }

    public String getSalarioFormatado() {
        return String.format("%,.2f", salario).replace(".", ",");
    }
}
