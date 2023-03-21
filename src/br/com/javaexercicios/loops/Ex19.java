package br.com.javaexercicios.loops;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
O Sr. Manoel Joaquim expandiu seus negócios para além dos negócios
de 1,99 e agora possui uma loja de conveniências.
- Faça um programa que implemente uma caixa registradora rudimentar.
- O programa deverá receber um número desconhecido de valores referente
aos preços das mercadorias.
- Um valor zero deve ser então informado pelo operador para indicar
o final da compra.
- O programa deve então mostrar o total da compra e perguntar o valor
em dinheiro que o cliente forneceu, para então calcular e mostrar o
valor do troco.
- Após esta operação, o programa deverá voltar ao ponto inicial, para
registrar a próxima compra.
- A saída deve ser conforme o exemplo abaixo:

Lojas Tabajara
Produto 1: R$ 2.20
Produto 2: R$ 5.80
Produto 3: R$ 0
Total: R$ 9.00

Dinheiro: R$ 20.00
Troco: R$ 11.00
...
*/
public class Ex19 {
    public static void main(String[] args) throws Exception{
        int quantidadeProdutos;
        double precoMercadorias;
        double totalCompra=0;
        double dinheiroFornecido;
        double troco;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade de produtos:");
        quantidadeProdutos = scan.nextInt();

        System.out.println("Lojas Tabajara");

        for(int i=1; i<=quantidadeProdutos; i++) {
            System.out.println("Digite o preço de cada mercadoria:");
            precoMercadorias = scan.nextDouble();

            System.out.println("Produto " + i + ": R$ " + precoMercadorias);
            totalCompra += precoMercadorias;

            if(precoMercadorias == 0) {
                throw new InputMismatchException("Produto " + i + ": R$ 0.00");
            }
        }
        System.out.println("Total: R$ " + totalCompra);

        System.out.println("Digite o valor do seu pagamento para calcular o troco");
        dinheiroFornecido = scan.nextDouble();
        troco = dinheiroFornecido - totalCompra;
        if(dinheiroFornecido == totalCompra) {
            System.out.println("Cliente não precisa de troco!");
        } else if(dinheiroFornecido == 0 || dinheiroFornecido <= -1 || dinheiroFornecido < totalCompra){
            System.out.println("Valor inválido! Insira um valor válido.");
        } else {
            System.out.println("Troco: R$ " + troco + " reais.");
        }
    }
}
