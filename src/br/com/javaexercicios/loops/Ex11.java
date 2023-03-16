package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que calcule o fatorial de um número fornecido pelo
usuário. Ex: 5! = 5.4.3.2.1 = 120
* */
public class Ex11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int total;

        System.out.println("Digite um número para calcular seu fatorial:");
        int numero = scan.nextInt();

        System.out.print(numero + "! = ");

        double fatorial = 1;
        for(int i = numero; i > 0; i--) {
            fatorial *= i;
            System.out.print(i + ".");
        }
        System.out.println(" = " + fatorial);
    }
}
