package br.com.javaexercicios.generation;

import java.util.Scanner;

/* Uma escola possui 3 alunos, cada um desses alunos possui 4 notas
 * de 4 bimestres. Faça um programa que calcule a média de cada aluno
 * e gere um relatório para cada aluno.*/
public class Matriz {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String nome[] = {"Mateus", "Pedro", "Julia"};
        double notas[][] = {{7.8, 8.9, 5.9, 6.6},
                            {5.6, 8.8, 6.9, 7.0},
                            {8.0, 8.2, 9.1, 7.5}};

        double[] medias = new double[3];

        for(int l=0; l<3; l++) {
            double soma = 0.0;
            for(int c=0; c<4; c++) {
                soma += notas[l][c];
            }
            medias[l] = soma/4;
        }

        int aluno;
        System.out.println("Digite o número do aluno:");
        aluno = scn.nextInt();
        if(aluno > 3) System.out.println("Digite um número válido para o aluno!");

        String situacao;

        if(medias[aluno]>6) {
            situacao = "Aprovadx";
        } else{
            situacao = "Reprovadx";
        }

        System.out.println("=========================");
        System.out.println("    Alunx: " + nome[aluno]);
        System.out.println("=========================");
        System.out.println("    1º bimestre: " + notas[aluno][0]);
        System.out.println("    2º bimestre: " + notas[aluno][1]);
        System.out.println("    3º bimestre: " + notas[aluno][2]);
        System.out.println("    4º bimestre: " + notas[aluno][3]);
        System.out.println("=========================");
        System.out.println("    Média: " + medias[aluno]);
        System.out.println("    Situação: " + situacao);
    }
}
