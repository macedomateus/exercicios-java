package br.com.javaexercicios.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/* Faça um programa que calcule o número médio de alunos
por turma. Para isto, peça a quantidade de turmas e a
quantidade de alunos para cada turma. Cada turma não pode
ter mais do que 40 alunos.
* */
public class Ex15 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual a quantidade de turmas?");
        int quantidadeTurmas = scan.nextInt();

        double somaAlunos = 0;
        double mediaAlunosPorTurma;

        for(int i=1; i<=quantidadeTurmas; i++) {
            System.out.println("Qual a quantidade de alunos?");
            int quantidadeAlunos = scan.nextInt();

            if(quantidadeAlunos > 40) {
                throw new InputMismatchException("As turmas" +
                        " não podem ter mais do que 40 alunos. Entre" +
                        " com um número válido!");
            } else {
                somaAlunos += quantidadeAlunos;
            }
        }
        mediaAlunosPorTurma = somaAlunos/quantidadeTurmas;
        System.out.println("A média de alunos por turma é: " + mediaAlunosPorTurma);

    }
}
