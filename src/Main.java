import Calculadora.Calculo;

import java.util.Objects;
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

        Calculo td = new Calculo();
        Scanner scn = new Scanner(System.in);
        String continuar;
        do {
            System.out.println("Qual a data desejada? (dd/mm/aaaa)");
            String data = scn.next();
            String resposta = td.resultado(data);
            System.out.printf("O dia %s é: %s", data, resposta);
            System.out.println("deseja continuar?[S/N]");
            continuar = scn.next();
        } while (continuar.equals("S"));
        scn.close();
        System.out.println("\n-------------------------------------------------------------------------------------");
        System.out.println("Obrigado! Até logo!");
    }

}
