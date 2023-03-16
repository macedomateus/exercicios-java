package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça dois números, base e expoente, calcule
e mostre o primeiro número elevado ao segundo número. Não utilize função
de potência da linguagem.
* */
public class Ex8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número");
        int base = scan.nextInt();
        System.out.println("Digite um segundo número");
        int expoente = scan.nextInt();

        int resultado = base;
        for(int i=1; i<expoente; i++){
            resultado *= base;
        }
        System.out.println("O resultado é: " + resultado);
    }
}
