import Calculadora.Calculo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Seja bem vindo!");
        System.out.println("Este programa Java é responsável por calcular o dia da semana de qualquer data desejada. " +
                "Basta apenas passar e conseguirá descobrir qual a data que deseja.");
        System.out.println("Para não haver erros, lembre sempre de usar o formato correto para calcular 'dd/mm/aaaa'.");
        System.out.println("Caso o dia (dd), mês (mm) ou ano (aaaa) não possuam a quantidade correta de caracteres," +
                "adicione um zero à esquerda para ter o jeito certo.");
        System.out.println("O cálculo é: DIA + CHAVE DO MÊS + CHAVE DO ANO - MAIOR MÚLTIPLO DE 7 = DIA DA SEMANA");
        System.out.println("Muito obrigado por ter vindo e se diverta!");
        System.out.println("-------------------------------------------------------------------------------------\n");

        Calculo td = new Calculo(); //Instanciando a classe Calculo
        Scanner scn = new Scanner(System.in); //Capturador do que está sendo escrito no terminal
        String continuar; //Define se o código deverá ser rodado após a finalização dos cálculos da data passada

        do {
            System.out.println("Qual a data desejada? (dd/mm/aaaa)");
            String data = scn.next(); //Atribuindo uma variável String para ler a data passada
            String resposta = td.resultado(data); //Chamando a classe mãe do pacote Calculadora

            System.out.printf("O dia %s é: %s%n", data, resposta);

            System.out.println("deseja continuar?[S/N]"); //Dando a opção de escolha para o usuário se deseja continuar
            continuar = scn.next(); //Lendo a responsta do usuário
        } while (continuar.equals("S")); //Loop while condicional para executar todo o bloco novamente ou não

        scn.close(); //Fechando o objeto Scanner.

        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("Obrigado! Até logo!");
    }

}
