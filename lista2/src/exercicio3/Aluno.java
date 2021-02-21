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
public class Aluno {
    private String nome;
    private String matricula;
    private String disciplina;
    private float nota1;
    private float nota2;
    private float notatrab;
    float media;

    public Aluno(String nome, String matricula, String disciplina, int nota1, int nota2, int notatrab) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplina = disciplina;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notatrab = notatrab;
    }
    
    public float calculoMedia(float nota1, float nota2, float notatrab){
        media = (nota1 + nota2 + notatrab) / 3;
        System.out.println("A média foi de: " + media);
        if (media>6){
            System.out.println("Aluno aprovado!");
        }
        if (media<6 & media>=4){
            System.out.println("Aluno de IFA!");
        }
        else if(media<4){
            System.out.println("Aluno Reprovado!");
        }
        return media;
    }
    
    public void situacao(float media){
        if (media>6){
            System.out.println("Aluno aprovado!");
        }
        if (media<6 & media>=4){
            System.out.println("Aluno de IFA!");
        }
        else if(media<4){
            System.out.println("Aluno Reprovado!");
        }
    }

    public float getNotatrab() {
        return notatrab;
    }

    public void setNotatrab(int notatrab) {
        this.notatrab = notatrab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }
    
    

    @Override
    public String toString() {
        return "Aluno{" + "nome=" + nome + ", matricula=" + matricula + ", disciplina=" + disciplina + ", nota1=" + nota1 + ", nota2=" + nota2 + ", notatrab=" + notatrab + '}';
    }
    
    
}
