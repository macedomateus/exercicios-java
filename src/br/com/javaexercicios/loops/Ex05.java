package br.com.javaexercicios.loops;

/* Faça um programa que receba dois números inteiros
e gere os números inteiros que estão no intervalo
compreendido por eles.
*/

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número:");
        num1 = scan.nextInt();
        System.out.println("Digite outro número:");
        num2 = scan.nextInt();

        for(int i = num1; i < num2; i++) System.out.println(i);
    }
}
