package br.com.javaexercicios.loops;

/*
Faça um programa que leia 5 números e informe
* o maior número.
*/

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maiorNumero = Integer.MIN_VALUE;

        for(int i=0; i<5; i++) {
            System.out.println("Digite um número");
            numero = scan.nextInt();

            if(numero > maiorNumero) {
                maiorNumero = numero;
            }
        }

        System.out.println("O maior número digitado foi: " + maiorNumero);
    }
}
