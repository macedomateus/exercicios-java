package br.com.javaexercicios.loops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Faça um programa que calcule e mostre a média aritmética de N notas.
* */
public class Ex13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas você irá adicionar?");
        int notas = scan.nextInt();

        double soma = 0;
        double media;
        double nota;

        for(int i=0; i<notas; i++) {
            System.out.println("Digite a nota:");
            nota = scan.nextDouble();

            soma += nota;
        }
        media = soma/notas;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);

    }
}
