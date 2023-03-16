package br.com.javaexercicios.loops;

/*
Faça um programa que imprima na tela os valores
* de 1 a 20, um abaixo do outro. Depois, modifique
* o programa para que ele mostre os números um ao
* lado do outro.
* */

public class Ex1 {
    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("---------");

        // imprimindo um número ao lado do outro
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
    }
}