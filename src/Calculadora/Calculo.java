/*
    Dia + Chave do mes + Chave do Ano - Maior múltiplo de 7 = Dia da semana.
 */
package Calculadora;

public class Calculo {
    private int mes;
    private int ano;
    private int dia;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int chaveMes(){
        switch (getMes()){
            case 4, 7 -> {return 0;}
            case 1,10 -> {return 1;}
            case 5 -> {return 2;}
            case 8 -> {return 3;}
            case 2,3,11 -> {return 4;}
            case 6 -> {return 5;}
            case 9,12 -> {return 6;}
            default -> {return 999;}
        }
    }

    public void chaveAno(){

    }

    public String chaveDiaSemana(int x){
        switch (x){
            case 1 -> {return "Domigo";}
            case 2 -> {return "Segunda-feira";}
            case 3 -> {return "Terça-feira";}
            case 4 -> {return "Quarta-feira";}
            case 5 -> {return "Quinta-feira";}
            case 6 -> {return "Sexta-feira";}
            case 7 -> {return "Sábado";}
            default -> {return "Ops, parece que houve um dado errado, tente novamente.";}
        }
    }


}
