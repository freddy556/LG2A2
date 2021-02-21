/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio5;

/**
 *
 * @author max_p
 */
public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        if(dia>31){
            System.out.println("Valor Inválido!");    
        }
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        if(mes>12){
            System.out.println("Valor inválido!");
        }
        return mes;
    }

    public void setMes(int mes) {
        if(mes>12){
            System.out.println("Valor inválido!");
        }
        this.mes = mes;
    }
    
    
    
}
