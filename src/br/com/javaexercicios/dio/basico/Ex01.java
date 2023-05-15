package br.com.javaexercicios.dio.basico;

import java.util.Scanner;

/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a
porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
O gerente de uma loja de carros gostaria de um programa para calcular o preço
de um carro novo para os clientes. Você receberá o custo de fábrica e as
porcentagens referentes ao distribuidor e os impostos e deverá escrever o
programa para ler esses valores e imprimir o valor final do carro.

---> Entrada <---
Você receberá três valores inteiros que representam o custo de fábrica,
as porcentagens do distribuidor e os impostos.

---> Saída <---
Como saída, teremos o valor final de um carro novo.

---> Exemplo <---
Entrada:
20000
28
45

Saída:
34600
* */
public class Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int custoFabrica,
                porcentagemDistribuidor,
                impostos,
                carroNovo,
                distribuidor,
                imposto;


        System.out.println("Digite o valor do custo de fábrica: ");
        custoFabrica = scan.nextInt();
        System.out.println("Digite o valor da porcentagem do distribuidor: ");
        porcentagemDistribuidor = scan.nextInt();
        System.out.println("Digite o valor dos impostos: ");
        impostos = scan.nextInt();

        distribuidor = (custoFabrica*porcentagemDistribuidor)/100;
        imposto = (custoFabrica*impostos)/100;

        carroNovo = custoFabrica+distribuidor+imposto;

        System.out.println("O valor total do carro é: " + carroNovo + " reias.");
    }
}
