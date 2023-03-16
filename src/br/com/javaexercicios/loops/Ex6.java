package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Altere o programa anterior para mostrar no final
a soma dos números.
* */
public class Ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1, num2;

        System.out.println("Digite um número:");
        num1 = scan.nextInt();
        System.out.println("Digite outro número:");
        num2 = scan.nextInt();

        int soma=0;

        for(int i = num1; i <= num2; i++) {
            soma += i;
        }

        System.out.println(soma);
    }
}
