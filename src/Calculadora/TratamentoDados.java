package Calculadora;

import java.util.HashMap;
import java.util.Map;

public class TratamentoDados {
int dia, mes, ano;

    public int getDia() {
        return dia;
    }

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

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void stringToInteger(String x){
        if(x.length() == 10){
            setDia(Integer.parseInt(x.substring(0, 2)));
            chaveMes(Integer.parseInt(x.substring(3, 5)));
            anoBissexto(Integer.parseInt(x.substring(6)));
            resultado();
        } else if (x.length() == 9) {
            setDia(Integer.parseInt(x.substring(0, 1)));
            chaveMes(Integer.parseInt(x.substring(2, 4)));
            anoBissexto(Integer.parseInt(x.substring(5)));
            resultado();
        } else {
            System.out.println("Data apresentada em formato errado, favor corrigir.");
        }
    }
    public void anoBissexto(int x){
        /*if(x % 4 == 0 && x % 100 != 0){
            System.out.println("Ano Bissexto, divisível por 4, primeiro caso");
        } else if (x % 4 == 0 && x % 100 == 0 && x % 400 == 0){
            System.out.println("Ano Bissexto, divisível por 4, segundo caso");
        }*/
        String ano = String.valueOf(x);
        chaveAno(Integer.parseInt(ano.substring(2)));
    }

    public void chaveMes(int x){
        switch (x){
            case 4, 7 -> {setMes(0);}
            case 1, 10 -> {setMes(1);            }
            case 5 -> {setMes(2);}
            case 8 -> {setMes(3);}
            case 2, 3, 11 -> {setMes(4);}
            case 6 -> {setMes(5);}
            case 9, 12 -> {setMes(6);}
            default -> {System.out.println("Invalido");}
        }
    }

    public void chaveAno(int x){
        switch (x){
            case 0, 6, 17, 23, 28, 34, 45, 51, 56, 62, 73, 79, 84, 90 ->{setAno(0);}
            case 1, 7, 12, 18, 29, 35, 40, 46, 57, 63, 68, 74, 85, 91, 96 -> {setAno(1);}
            case 13, 19, 24, 30, 41, 47, 52, 58, 69, 75, 80, 86, 97 -> {setAno(2);}
            case 8, 14, 25, 31, 36, 42, 53, 59, 64, 70, 81, 87, 92, 98 -> {setAno(3);}
            case 9, 15, 20, 26, 37, 43, 48, 54, 65, 71, 76, 82, 93, 99 -> {setAno(4);}
            case 10, 21, 27, 32, 38, 49, 55, 60, 66, 77, 83, 88, 94 -> {setAno(5);}
            default -> {setAno(6);}
        }
    }

    public void resultado(){
        Map<Integer, String> semana = new HashMap<>();
        semana.put(1, "Domingo");
        semana.put(2, "Segunda-feira");
        semana.put(3, "Terça-feira");
        semana.put(4, "Quarta-feira");
        semana.put(5, "Quinta-feira");
        semana.put(6, "Sábado");

        int soma = getDia() + getMes() + getAno();
        int maiorMultiplo7 = (soma / 7) * 7;
        int resultado = soma - maiorMultiplo7;

        System.out.printf("Chave do dia: %d%n", getDia());
        System.out.printf("Chave do mês: %d%n", getMes());
        System.out.printf("Chave do ano: %d%n", getAno());
        System.out.println(semana.get(resultado));
    }


}
