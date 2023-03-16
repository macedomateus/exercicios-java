package br.com.javaexercicios.loops;

import com.sun.javafx.scene.SceneHelper;

import java.util.Scanner;

/* Faça um programa que peça um número inteiro e determine se ele é ou não
um número primo. Um número primo é aquele que é divisível somente por ele
mesmo e por 1.
* */
public class Ex12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int numero = scan.nextInt();

        boolean numeroPrimo = true;

        for(int i = 2; i < numero; i++) {
            if(numero % i == 0) {
                System.out.println("Não é número primo - divisível por: " + i);
                numeroPrimo = false;
            }
        }
        if(numeroPrimo) {
            System.out.println("É número primo");
        }
    }
}
