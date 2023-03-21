package br.com.javaexercicios.loops;

/* O Sr. Manoel Joaquim acaba de adquirir uma panificadora e pretende
implantar a metodologia da tabelinha, que já é um sucesso na sua loja
de 1,99. Você foi contratado para desenvolver um programa que monta a tabela
de preços de pães, a partir do preço do pão informado pelo usuário, conforme
o exemplo abaixo:

Preço do pão: R$ 0.18
Panificadora Pão de Ontem - Tabela de preços
1 - R$ 0.18
2 - R$ 0.36
...
50 - R$ 9.00
 */

import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        double valorUnitario = 0.18d;
        float total=0f;

        Scanner scan = new Scanner(System.in);
        System.out.println("Quantos pães você deseja comprar?");
        int quantidadeDePaes = scan.nextInt();

        System.out.println("Panificadora Pão de Ontem - Tabela de preços:");

        for(int i=1; i<=quantidadeDePaes; i++) {
            total += valorUnitario;
            System.out.println(i + " - R$ " + total);
        }

        System.out.println("O cliente deseja comprar: " + quantidadeDePaes + " pães. Valor total a ser pago R$ " + total);
    }
}
