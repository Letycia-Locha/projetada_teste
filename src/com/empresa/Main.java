package com.empresa;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors; 

public class Main {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        // 3.1 – Inserir todos os funcionários, na mesma ordem da tabela do desafio
        funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
        funcionarios.add(new Funcionario("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38"), "Operador"));
        funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14"), "Coordenador"));
        funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
        funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68"), "Recepcionista"));
        funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
        funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84"), "Contador"));
        funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45"), "Gerente"));
        funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85"), "Eletricista"));
        funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93"), "Gerente"));

        // 3.2 – Remover o funcionário "João" da lista
        funcionarios.removeIf(f -> f.getNome().equals("João"));

        // 3.3 – Imprimir todos os funcionários com informações formatadas
        System.out.println("\nLista de Funcionários:");
        for (Funcionario f : funcionarios) {
            // Exibir data no formato dd/MM/yyyy e salário formatado
            System.out.println(f.getNome() + ", " +
                    f.getDataNascimentoFormatada() + ", " +
                    f.getSalarioFormatado() + ", " +
                    f.getFuncao());
        }

        // 3.4 – Aplicar aumento de 10% para todos os funcionários
        for (Funcionario f : funcionarios) {
            f.aumentarSalario();
        }

        // 3.5 – Agrupar funcionários por função em um Map
        Map<String, List<Funcionario>> funcionariosPorFuncao = funcionarios.stream()
                .collect(Collectors.groupingBy(Funcionario::getFuncao));

        // 3.6 – Imprimir funcionários agrupados por função
        System.out.println("\nFuncionários agrupados por função:");
        funcionariosPorFuncao.forEach((funcao, lista) -> {
            System.out.println("\n" + funcao + ":");
            lista.forEach(f -> System.out.println(" - " + f.getNome()));
        });

        // 3.8 – Imprimir funcionários que fazem aniversário nos meses 10 e 12
        System.out.println("\nFuncionários que fazem aniversário nos meses 10 e 12:");
        funcionarios.stream()
                .filter(f -> f.getDataNascimento().getMonthValue() == 10 || f.getDataNascimento().getMonthValue() == 12)
                .forEach(f -> System.out.println(" - " + f.getNome() + " (" + f.getDataNascimentoFormatada() + ")"));

        // 3.9 – Encontrar e imprimir o funcionário mais velho
        Funcionario maisVelho = Collections.min(funcionarios, Comparator.comparing(Funcionario::getDataNascimento));
        int idade = Period.between(maisVelho.getDataNascimento(), LocalDate.now()).getYears();
        System.out.println("\nFuncionário mais velho: " + maisVelho.getNome() + ", " + idade + " anos");

        // 3.10 – Imprimir a lista de funcionários por ordem alfabética
        funcionarios.sort(Comparator.comparing(Funcionario::getNome));
        System.out.println("\nLista de funcionários em ordem alfabética:");
        funcionarios.forEach(f -> System.out.println(" - " + f.getNome()));

        // 3.11 – Calcular e imprimir o total dos salários dos funcionários
        BigDecimal totalSalarios = funcionarios.stream()
                .map(Funcionario::getSalario)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println("\nTotal dos salários dos funcionários: " + totalSalarios);

        // 3.12 – Calcular quantos salários mínimos cada funcionário recebe
        BigDecimal salarioMinimo = new BigDecimal("1212.00");
        System.out.println("\nQuantidade de salários mínimos por funcionário:");
        funcionarios.forEach(f -> {
            BigDecimal qtdSalariosMinimos = f.getSalario().divide(salarioMinimo, 2, RoundingMode.HALF_UP);
            System.out.println(f.getNome() + " recebe " + qtdSalariosMinimos + " salários mínimos.");
        });
    }
}
