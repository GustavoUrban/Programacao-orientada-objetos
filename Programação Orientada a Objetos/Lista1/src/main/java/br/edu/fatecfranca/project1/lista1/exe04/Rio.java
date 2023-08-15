/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gondi
 * 
 * //CRIANDO A CLASSE
 */

package br.edu.fatecfranca.project1.lista1.exe04;

        
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido;
}

public void ensolarar(double x){
    if(x<= this.nivel){
    this.nivel -=x;
    System.out.printIn("Nível do rio foi diminuido");
    }
    else{
    System.out.printIn("Nível não pode ser negativo")

    }
}

public void chover(double x){
     this.nivel +=x;
     System.out.printIn("Nível do Rio foi aumentado");
}

public void sujar(){
    if (this.poluido){
     System.out.printIn("Rio já poluído");
    }
    else{
    this.poluido = true;
    System.out.printIn("Rio foi sujado");
    }
}

public void limpar(){
    
}
