package br.com.javaexercicios.dio.basico;

import java.util.Scanner;

/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
positivos. Na próxima linha, deve-se mostrar a média de todos os valores
positivos digitados, com um dígito após o ponto decimal.

---> Entrada <---
A entrada contém 6 números que podem ser valores inteiros ( int ) ou de ponto
flutuante ( float ou double ). Pelo menos um destes números será positivo.

---> Saída <---
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha
deve mostrar a média dos valores positivos digitados.

---> Exemplo <---
Entrada:
7
-5
6
-3.4
4.6
12

Saída:
4 valores positivos
média dos valores positivos digitados: 7.4
* */
public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero,
                positivos=0,
                soma=0;
        double media;

        System.out.println("Digite seis valores:");
        for(int i=1; i<=6; i++) {
            numero = scan.nextInt();
            if(numero>0){
                positivos++;
                soma+=numero;
            }
        }
        System.out.println(positivos + " valores positivos.");
        media = soma/positivos;
        System.out.println("Média dos valores positivos digitados: " + media);

    }
}

