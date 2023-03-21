package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça 10 números inteiros, calcule e mostre
a quantidade de números pares e a quantidade de números ímpares.
* */
public class Ex09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int resultado = 0;
        int numero;
        int pares = 0;
        int impares = 0;

        for(int i=1; i<=10; i++) {
            System.out.println("Digite um número:");
            numero = scan.nextInt();
            resultado += numero;

            if(numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("A soma dos números digitados é: " + resultado);
        System.out.println("Quantidade de números pares: " + pares);
        System.out.println("Quantidade de números ímpares: " + impares);
    }
}
