package br.com.javaexercicios.loops;

import java.util.Scanner;

/* O Sr. Manoel Joaquim possui uma grande loja de artigos de R$ 1,99,
com cerca de 10 caixas. Para agilizar o cálculo de quanto cada
cliente deve pagar, ele desenvolveu uma tabela que contém o número
de itens que o cliente comprou e ao lado o valor da conta. Destas forma,
a atendente do caixa precisa contar apenas quantos itens o cliente está
levando e olhar na tabela de preços. Você foi contratado para desenvolver
o programa que monta esta tabela de preços, que conterá os preços de 1 até
50 produtos, conforme o exemplo abaixo:

Lojas Quase Dois - Tabela de preços
1 - R$ 1,99
2 - R$ 3.98
...
50 - R$ 99.50
* */
public class Ex17 {
    public static void main(String[] args) {
        double precoUnitario = 1.99d;
        int quantidadeProdutos;
        double total=0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos que o cliente deseja comprar:");
        quantidadeProdutos = scan.nextInt();

        System.out.println("Lojas Quase Dois - Tabela de preços:");

        for(int i=1; i<=50; i++) {
            total += precoUnitario;
            System.out.println(i + " - R$ " + total);
        }

        System.out.println("-------------");

        System.out.println("A quantidade de produtos é: " + quantidadeProdutos);
    }
}
