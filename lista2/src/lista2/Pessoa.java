/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author max_p
 */
public class Pessoa {
    private String nome;
    private int dia;
    private int mes;
    private int ano;
    private double altura;
    private int idade;

    public Pessoa(String nome, int dia, int mes, int ano, double altura) {
        this.nome = nome;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mês) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public int calculaIdade(int ano){
        idade = 2020 - ano;
        return idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", dia=" + dia + ", m\u00eas=" + mes + ", ano=" + ano + ", altura=" + altura + '}';
    }
    
    


    
}
