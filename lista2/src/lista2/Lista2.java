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
public class Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Lucas", 27, 7, 1995, 1.7);
        p1.calculaIdade(1995);
        System.out.println("O nome da pessoa é " + p1.getNome());
        System.out.println("Nascida no dia " + p1.getDia());
        System.out.println("do mês " + p1.getMes());
        System.out.println("no ano de " + p1.getAno());
        System.out.println("E possui a altura em metros de " + p1.getAltura());
        System.out.println("Sua idade em anos é de " + p1.getIdade());
        
        
    }
    
}
