package br.com.javaexercicios.loops;

import com.sun.javafx.binding.DoubleConstant;

import java.util.Scanner;

/* O Departamento Estadual de Meteorologia lhe contratou para desenvolver
um programa que leia um conjunto indeterminado de temperaturas, e informe
ao final a menor e a maior temperaturas informardas, bem como a média das
temperaturas.
* */
public class Ex20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double maiorTemperatura = Double.MIN_VALUE;
        double menorTemperatura = Double.MAX_VALUE;
        double media;
        double soma=0;

        System.out.println("Digite a quantidade de temperaturas");
        int quantidadeTemperaturas = scan.nextInt();

        for(int i=1; i<=quantidadeTemperaturas; i++) {
            System.out.println("Digite a temperatura");
            double temperaturaInformada = scan.nextDouble();

            if(temperaturaInformada > maiorTemperatura) {
                maiorTemperatura = temperaturaInformada;
            }
            if (temperaturaInformada < menorTemperatura) {
                menorTemperatura = temperaturaInformada;
            }

            soma += temperaturaInformada;
        }
        media = soma/quantidadeTemperaturas;

        System.out.println("A maior temperatura registrada é: " + maiorTemperatura + " graus.");
        System.out.println("A menor temperatura registrada é: " + menorTemperatura + " graus.");
        System.out.println("A soma das temperaturas é: " + soma);
        System.out.println("A média de temperaturas é: " + media + " graus.");

    }
}
