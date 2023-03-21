package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Desenvolva um gerador de tabuada, capaz de gerar a tabuada
de qualquer número inteiro entre 1 a 10. O usúario deve informar
de qual número ele deseja ver a tabuada.
* */
public class Ex07 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a tabuada que deseja ver:");
        int numero = scan.nextInt();

        System.out.println("Tabuada de: " + numero + ":");

        for(int i=1; i<=10; i++) {
            int resultado = numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
