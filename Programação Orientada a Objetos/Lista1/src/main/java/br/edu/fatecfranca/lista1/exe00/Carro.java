
package br.edu.fatecfranca.lista1.exe00;

public class Carro {
        
    public String marca, modelo;
    public double veloAtual;
    public boolean statusMotor; //true ou false
    
    // Crie os dois contrutores da classe Carro
    
    public Carro(){
        
    }
    public Carro(String marca, String modelo, double veloAtual, boolean statusMotor){
        this.marca = marca;
        this.modelo = modelo;
        this.veloAtual = veloAtual;
        this.statusMotor = statusMotor;
    }
    
    //Faca um metodo para ligar o motor do carro
    public void ligar (){
       if(!this.statusMotor) {
           this.statusMotor = true;
       }
    }
   
    //Faça um metodo para desligar o motor do carro
     public void desligar(){
        this.statusMotor = false;
        if (this.veloAtual > 0){
            this.veloAtual = 0;
        }
        
    }
     //faca um metodo para acelerar o carro de x unidades
     public void acelerar(int x){
         if (this.statusMotor){
             this.veloAtual += x;
         }
     }

     //faca um metodo para frear o carro x de unidades
     public void desacelerar (int x){
         if(this.statusMotor = false){
             this.veloAtual -= x;
         }
         
     }
     
}
