package br.com.javaexercicios.loops;

/* A série de Fibonacci é formada pela sequência 1,1,2,3,5,8,13,21,34,55...
Faça um programa capaz de gerar a série até o n-ésimo termo.
* */

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o n-ésimo termo da série de Fibonacci:");
        int n = scan.nextInt();

        int primeiroNumero = 1;
        int segundoNumero = 1;
        int proximoNumero;

        for(int i=3; i<=n; i++){
            proximoNumero = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximoNumero;

            System.out.println(proximoNumero);
        }
    }
}
