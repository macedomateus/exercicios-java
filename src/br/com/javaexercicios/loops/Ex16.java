package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que calcule o valor total
investido por um colecionador em sua coleção de CDs e
o valor médio gasto em cada um deles. O usuário deverá
informar a quantidade de CDs e o valor pago em cada um.
* */
public class Ex16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a quantidade de CDs que contêm" +
                " em sua coleção:");
        int quantidadeTotalDeCDs = scan.nextInt();

        double valorTotalDaColecao=0;
        double valorMedioPorUnidade;

        for(int i=1; i<=quantidadeTotalDeCDs; i++) {
            System.out.println("Qual o valor pago em cada um dos CDs?");
            double precoUnitario = scan.nextDouble();

            valorTotalDaColecao += precoUnitario;
        }

        valorMedioPorUnidade = valorTotalDaColecao/quantidadeTotalDeCDs;

        System.out.println("O valor total da coleção de CDs é: " + valorTotalDaColecao);
        System.out.println("A média de valores por unidade é: " + valorMedioPorUnidade);
    }
}
