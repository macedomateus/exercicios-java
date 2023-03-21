package br.com.javaexercicios.loops;

/*
Faça um programa que leia 5 números e informe
* a soma e a média dos números.
*/

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        double media;
        double soma = 0;

        for(int i=0; i<5; i++) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();

            soma += numero;
        }
        media = soma / 5;

        System.out.println("A soma dos números é: " + soma);
        System.out.println("A média dos números é: " + media);
    }
}
