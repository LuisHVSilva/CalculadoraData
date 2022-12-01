/*public void stringToInteger(String x){
        anoBissexto(Integer.parseInt(x.substring(6)));

        }
*/
package Calculadora;

import java.util.HashMap;
import java.util.Map;

public class Calculo {
    /*Espaço das variáveis*/
    int dia, mes, ano;
    boolean anobi;

    /*Espaço dos ncapsuladores das variáveis*/
    public int getDia() {return dia;}
    public void setDia(int dia) {this.dia = dia;}
    public int getMes() {return mes;}
    public void setMes(int mes) {this.mes = mes;}
    public int getAno() {return ano;}
    public void setAno(int ano) {this.ano = ano;}
    public boolean isAnobi() {return anobi;}
    public void setAnobi(boolean anobi) {this.anobi = anobi;}

    /*Espaço das funções*/

    //Função usada para transformar em números inteiros o dia, mês e o ano passado pelo usuário.
    public void stringToInteger(String x){
        if(x.length() == 10){
            setDia(Integer.parseInt(x.substring(0, 2)));
            setMes(Integer.parseInt(x.substring(3, 5)));
            setAno(Integer.parseInt(x.substring(6)));
        } else {
            System.out.println("Data apresentada em formato errado, favor corrigir.");
        }
    }

    //Definir a chave do ano.
    public void chaveAno(){
        String a = String.valueOf(getAno());
        int x;
        switch (Integer.parseInt(a.substring(2))){
            case 0, 6, 17, 23, 28, 34, 45, 51, 56, 62, 73, 79, 84, 90 -> {x = 0;}
            case 1, 7, 12, 18, 29, 35, 40, 46, 57, 63, 68, 74, 85, 91, 96 -> {x = 1;}
            case 13, 19, 24, 30, 41, 47, 52, 58, 69, 75, 80, 86, 97 -> {x = 2;}
            case 8, 14, 25, 31, 36, 42, 53, 59, 64, 70, 81, 87, 92, 98 -> {x = 3;}
            case 9, 15, 20, 26, 37, 43, 48, 54, 65, 71, 76, 82, 93, 99 -> {x = 4;}
            case 10, 21, 27, 32, 38, 49, 55, 60, 66, 77, 83, 88, 94 -> {x = 5;}
            default -> {x = 6;}
        }
    }

    //Definir a chave do Mês.
    public void chaveMes(){
        switch (getMes()){
            case 4, 7 -> {setMes(0);}
            case 1, 10 -> {setMes(1);}
            case 5 -> {setMes(2);}
            case 8 -> {setMes(3);}
            case 2, 3, 11 -> {setMes(4);}
            case 6 -> {setMes(5);}
            case 9, 12 -> {setMes(6);}
            default -> {System.out.println("Invalido");}
        }

    }

    //Definir a chave da semana.
    public Map<Integer, String> chaveSemana(){
        Map<Integer, String> semana = new HashMap<>();
        semana.put(0, "Sábado");
        semana.put(1, "Domingo");
        semana.put(2, "Segunda-feira");
        semana.put(3, "Terça-feira");
        semana.put(4, "Quarta-feira");
        semana.put(5, "Quinta-feira");
        semana.put(6, "Sexta-feira");
        return semana;
    }

    //Calcular o número que será usado para mudar a chave do ano caso seja necessário
    public void seculo(){
        if(getAno() - 1900 >= 100) {
            int sec = ((1900 - getAno())/100) != 0 ? (1900 - getAno())/100 : 6;
            setAno(getAno() + sec);
        } else if(getAno() - 1900 < 0) {
            int sec = (((1900 - getAno()) + 100) / 100) + 1 != 0 ? (((1900 - getAno()) + 100) / 100) : 6;
            setAno(getAno() +sec + 1);
        }
    }

    //Descobrir se o ano é bissexto.
    public void anoBissexto(){
        setAnobi(false);
        if(getAno() % 4 == 0 && getAno() % 100 != 0){
            setAnobi(true);
        } else if (getAno() % 4 == 0 && getAno() % 100 == 0 && getAno() % 400 == 0){
            setAnobi(true);
        }
    }

    //Fazer o cálculo do dia da semana.
    public String resultado(String x){

        stringToInteger(x);
        anoBissexto();
        chaveMes();
        chaveAno();
        seculo();

        int soma = getDia() + getMes() + getAno();
        int maiorMultiplo7 = (soma / 7) * 7;
        int resultado = soma - maiorMultiplo7;

        System.out.printf("Chave do dia: %d", getDia());
        System.out.printf(" | Chave do mês: %d", getMes());
        System.out.printf(" | Chave do ano: %d%n", getAno());

        if(isAnobi() && (getMes() == 1 || getMes() == 4)) {
            return chaveSemana().get(resultado - 1);
        } else {
            return chaveSemana().get(resultado);
        }
    }
}
