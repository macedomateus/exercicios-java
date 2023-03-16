package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que peça para n pessoas a sua idade, ao
final o programa deverá verificar se a média de idade da turma
varia entre 0 e 25 - 26 e 60 - maior que 60. E então dizer
se turma é jovem, adulta ou idosa.
* */
public class Ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantidade de pessoas participando da pesquisa:");
        int quantidadePessoas = scan.nextInt();

        int media;
        int idade;
        int somaIdades=0;

        for(int i=0; i<quantidadePessoas; i++) {
            System.out.println("Digite a sua idade:");
            idade = scan.nextInt();

            somaIdades += idade;
        }

        System.out.println("Soma das idades: " + somaIdades);

           media = somaIdades/quantidadePessoas;
        System.out.println("Média de idades: " + media);

            if(media>=0 && media<=25) {
                System.out.println("Grupo Jovem");
            } else if(media>=26 && media<=60) {
                System.out.println("Grupo Adulto");
            } else if(media > 60) {
                System.out.println("Grupo Idosos");
            } else {
                System.out.println("Valor inválido!");
            }

    }
}
