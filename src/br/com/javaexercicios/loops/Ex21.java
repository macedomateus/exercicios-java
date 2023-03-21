package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Encontrar números primos é uma tarefa difícil. Faça um programa que
gera uma lista dos números primos existentes entre 1 e um número inteiro
informado pelo usuário.
* */
public class Ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro");
        int numero = scan.nextInt();

        boolean numeroPrimo;

        for(int i=1; i<=numero; i++) {
           numeroPrimo = true;

            for(int j=2; j<i; j++) {
                if(i % j == 0) {
                    numeroPrimo = false;
                }
            }

            if(numeroPrimo) {
                System.out.println(i);
            }
        }
    }
}
