
package com.mycompany.aluno;

public class Aluno {

    public int numeroAluno, idade;
    public String nome;
    public float p1, p2;
    public boolean TestaAluno;
    
    public Aluno (String nome, int numeroAluno, int idade, float p1, float p2){
        this.nome = nome;
        this.numeroAluno = numeroAluno;
        this.idade = idade;
        this.p1 = p1;
        this.p2 = p2;
     
    }

    Aluno() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
            
   public void notaFinal( float NotaFinal){
       NotaFinal = this.p1 + this.p2;
       System.out.println("Nota Final: "+ NotaFinal);
   }
   public void dadosAluno(){
       System.out.println("Nome: " + this.nome + "Numero do Aluno: " + this.numeroAluno + "Idade: " + this.idade);
            
   }
   
       
   }
           
   
    

