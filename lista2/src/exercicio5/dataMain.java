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
public class dataMain {
    public static void main(String[] args){
        Data d1 = new Data(12, 07, 2021);
        
        System.out.printf("Data: %d/%d/%d\n", d1.getDia(), d1.getMes(), d1.getAno());
        
    }
    
}
