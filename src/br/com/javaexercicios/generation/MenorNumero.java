package br.com.javaexercicios.generation;

public class MenorNumero {
    public static void main(String[] args) {
        int[] numeros = {-1,3,-4,2,6};

        int menorNumero = 0;

        for (int numero : numeros) {
            if(numero < menorNumero) {
                menorNumero = numero;
            }
        }
        System.out.println(menorNumero);
    }
}