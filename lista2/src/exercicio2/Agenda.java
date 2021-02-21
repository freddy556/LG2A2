/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio2;

/**
 *
 * @author max_p
 */
public class Agenda {
    
    public static void main(String[] args){
        Contato c1 = new Contato("Lucifer", 96666666);
        Contato c2 = new Contato("Luis", 96665666);
        Contato c3 = new Contato("Luiza", 96632066);
        Contato c4 = new Contato("Leo", 98826666);
        Contato c5 = new Contato("Abner", 96664066);
        Contato c6 = new Contato("Olav", 96612566);
        Contato c7 = new Contato("Hawk", 96664446);
        System.out.println("" + c1.getNome());
        System.out.println("Telefone: " + c1.getTelefone());
        System.out.println("" + c2.getNome());
        System.out.println("Telefone: " + c2.getTelefone());
        System.out.println("" + c3.getNome());
        System.out.println("Telefone: " + c3.getTelefone());
        System.out.println("" + c4.getNome());
        System.out.println("Telefone: " + c4.getTelefone());
        System.out.println("" + c5.getNome());
        System.out.println("Telefone: " + c5.getTelefone());
        System.out.println("" + c6.getNome());
        System.out.println("Telefone: " + c6.getTelefone());
        System.out.println("" + c7.getNome());
        System.out.println("Telefone: " + c7.getTelefone());
    }
    
}
