package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Faça um programa que calcule o número médio de alunos
por turma. Para isto, peça a quantidade de turmas e a
quantidade de alunos para cada turma. As turmas não podem
ter mais do que 40 alunos.
* */
public class Ex15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de turmas?");
        int quantidadeTurmas = scan.nextInt();
        System.out.println("Qual a quantidade de alunos?");
        int quantidadesAlunos = scan.nextInt();

        if(quantidadesAlunos > 40) System.out.println("As turmas" +
                "não podem ter mais do que 40 alunos. Entre" +
                "com um número válido!");

        int mediaAlunosPorTurma;

        for()
    }
}
