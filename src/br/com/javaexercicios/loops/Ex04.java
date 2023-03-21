package br.com.javaexercicios.loops;

/*
Faça um programa que imprima apenas os números
* ímpares entre 1 e 50.
*/

public class Ex04 {
    public static void main(String[] args) {

        for(int i=1; i<=50; i++){
            if(i % 2 != 0) System.out.println(i);
        }
    }
}
