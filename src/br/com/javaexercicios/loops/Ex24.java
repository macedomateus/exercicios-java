package br.com.javaexercicios.loops;

import java.util.Scanner;

/* O cardápio de uma lanchonete é o seguinte:

Especificação   -   Código  -   Preço
Cachorro quente     100         R$1,20
Bauru simples       101         R$1,30
Bauru com ovo       102         R$1,50
Hambúrguer          103         R$1,20
Cheeseburguer       104         R$1,30
Refrigerante        105         R$1,00

- Faça um programa que leia o código dos itens pedidos e as quantidades desejadas.
- Calcule e mostre o valor a ser pago por item (preço * quantidade) e o total geral
do pedido.
- Considere que o cliente deve informar quando o pedido dever ser encerrado.
* */
public class Ex24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int codigo;
        int quantidadeItens;
        boolean pedidoFinalizado = false;
        double preco = 0;
        double valorTotalItens = 0;
        double valorTotalDoPedido = 0;

        do {
            System.out.println("Primeiro digite o código do item que deseja comprar e depois digite a quantidade." +
                    " Se desejar finalizar o pedido, digite 00");
            codigo = scan.nextInt();
            quantidadeItens = scan.nextInt();

            if (codigo == 0 && quantidadeItens == 0) {
                pedidoFinalizado = true;
            } else {
                switch (codigo) {
                    case 100:
                        preco = 1.20;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Cachorro quente -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    case 101:
                        preco = 1.30;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Bauru simples -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    case 102:
                        preco = 1.50;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Bauru com ovo -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    case 103:
                        preco = 1.20;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Hambúrguer -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    case 104:
                        preco = 1.30;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Cheeseburguer -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    case 105:
                        preco = 1.00;
                        valorTotalItens = preco * quantidadeItens;
                        System.out.println("Refrigerante -> quantidade: " + quantidadeItens +
                                ".\nvalor: " + valorTotalItens);
                        break;
                    default:
                        System.out.println("Esse item não existe!");
                }

                valorTotalDoPedido += valorTotalItens;
            }
        } while (!pedidoFinalizado);

        System.out.println("Valor final a ser pago: " + valorTotalDoPedido + " reais.");
    }
}
