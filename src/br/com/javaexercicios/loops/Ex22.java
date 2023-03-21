package br.com.javaexercicios.loops;

import java.util.Scanner;

/* Desenvolva um programa que faça a tabuada de um número qualquer
inteiro que será digitado pelo usuário, mas a tabuada não deve,
necessariamente, iniciar em 1 e terminar em 10. O valor inicial e
final devem ser informados também pelo usuário, conforme exemplo abaixo:

Montar a tabuada de: 5
Começar por: 4
Terminar em: 7

Vou montar a tabuada de 5 começando em 4 e terminando em 7:
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35

Obs: Você deve verificar se o usuário não digitou o valor final menor
que o inicial.
* */
public class Ex22 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int tabuada;
        int valorInicial;
        int valorFinal;

        System.out.println("Digite um número que deseja ver a tabuada");
        tabuada = scan.nextInt();
        System.out.println("Digite o primeiro multiplicador");
        valorInicial = scan.nextInt();
        System.out.println("Digite o último multiplicador");
        valorFinal = scan.nextInt();

        System.out.println("Montar a tabuada de: " + tabuada);
        System.out.println("Começar por: " + valorInicial);
        System.out.println("Terminar em: " + valorFinal);

        System.out.println("Vou montar a tabuada de " + tabuada + " começando"
                + " por " + valorInicial + " e terminando em " + valorFinal + ":");

        if(valorFinal < valorInicial) {
            System.out.println("O valor inicial não pode ser menor que o valor final! Digite novamente");
        } else {
            for(int i=valorInicial; i<=valorFinal; i++) {
                System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
            }
        }
    }
}
