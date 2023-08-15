/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.project1.exe02;

/**
 *
 * @author gondi
 */
public class Cliente {
    
    //criando as variáveis
    public int nroConta, nroAgencia;
    public String nome;
    public double saldo;
    
    
}
    
    //criando constructor sem parametros
public Cliente(){

}

    //criando constructur com parametros

public Cliente ( int nroConta, int nroAgencia, String nome, double saldo){
    
    this.nroConta = nroConta;
    this.nroAgencia = nroAgencia;
    this.nome = nome;
    this.saldo = saldo;
}

    //Criando métodos public  realizarDeposito() e realizarSaque() que,
    //realizam depósito e saque, respectivamente, na conta do cliente.

public void realizarDeposito(double x){
    this.saldo = this.saldo + x;  //ou this.saldo +=x
}
public void realizarSaque (double x){
    if (x <= this.saldo){
        this.saldo -=x
    }
    else{
    System.out.printIn("Saldo Insuficiente");
    }
    
}

//Criando um outro método public que retorna o numero da conta
//nome do cliente e saldo atual. 


// CHAMANDO O OBJETO
public String paraString(){
    return "Nro Agência" + this.nroAgencia + 
           "Nro da Conta" + this.nroConta +
           "Nome" + this.nome +
           "Saldo:" + this.saldo;
}

