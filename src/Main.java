import Calculadora.Calculo;

public class Main {

    public static void main(String[] args) {

        Calculo td = new Calculo();
        String data = "01/12/2022";


        String resposta = td.resultado(data);
        System.out.printf("O dia %s é: %s", data,resposta);



    }

}
