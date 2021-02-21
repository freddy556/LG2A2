/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio3;



/**
 *
 * @author max_p
 */
public class AlunoMain {
    public static void main(String[] args){
        Aluno a1 = new Aluno("Aristeu", "SP3333333", "LG2A2", 3, 3, 1);
        System.out.println("" + a1.getNome());
        System.out.println("Matricula: " + a1.getMatricula());
        System.out.println("Na disciplina: " + a1.getDisciplina());
        System.out.println("Nota da p1: " + a1.getNota1());
        System.out.println("Nota da p2: " + a1.getNota2());
        System.out.println("Nota do trabalho: " + a1.getNotatrab());
        a1.calculoMedia(3, 3, 3);
        Aluno a2 = new Aluno("Fred", "SP3399333", "LG2A2", 4, 4, 4);
        System.out.println("" + a2.getNome());
        System.out.println("Matricula: " + a2.getMatricula());
        System.out.println("Na disciplina: " + a2.getDisciplina());
        System.out.println("Nota da p1: " + a2.getNota1());
        System.out.println("Nota da p2: " + a2.getNota2());
        System.out.println("Nota do trabalho: " + a2.getNotatrab());
        a2.calculoMedia(4, 4, 4);
        Aluno a3 = new Aluno("Carlos", "SP3333333", "LG2A2", 8, 9, 10);
        System.out.println("" + a3.getNome());
        System.out.println("Matricula: " + a3.getMatricula());
        System.out.println("Na disciplina: " + a3.getDisciplina());
        System.out.println("Nota da p1: " + a3.getNota1());
        System.out.println("Nota da p2: " + a3.getNota2());
        System.out.println("Nota do trabalho: " + a3.getNotatrab());
        a3.calculoMedia(8, 9, 10);

        
    }
    
}
