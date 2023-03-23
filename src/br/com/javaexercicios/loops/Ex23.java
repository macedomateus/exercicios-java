package br.com.javaexercicios.loops;

import java.text.DecimalFormat;

/* Um funcionário de uma empresa recebe aumento salarial anualmente:
Sabe-se que:
    a) Esse funcionário foi contratado em 1995, com salário inicial
de R$ 1.000,00;
    b) Em 1996 recebeu aumento de 1,5% sobre seu salário inicial;
    c) A partir de 1997 (inclusive), os aumentos salariais sempre
correspondem ao dobro do percentual do ano anterior.

- Faça um programa que determine o salário atual desse funcionário.
- Após concluir isso, altere o programa permitindo que o usuário
digite o salário inicial do funcionário.
* */
public class Ex23 {
    public static void main(String[] args) {

        double salario = 1000;
        double taxaDeAumento = 1.5;
        salario += (salario/100) * taxaDeAumento;

        DecimalFormat format = new DecimalFormat("###,###.##");

        for(int i=1997; i<=2023; i++) {
            taxaDeAumento *= 2;
            salario += (salario/100) * taxaDeAumento;
            System.out.println("Ano: " + i + " -> salário: " + format.format(salario));
        }

        System.out.println("O salário atual do funcioário é: " + salario);
    }
}
