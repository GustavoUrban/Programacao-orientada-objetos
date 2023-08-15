/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.project1.lista1.exe03;

public class Produto {
    
    // criando as variaveis
    
    public String nome; //tipo de dado String (uma classe)
    public int qtde; // tipo de dados int (tipo primitivo)
    public double preco; //tipo de dado é double (tipo primitivo)
 
    
    // criando um metodo construtor sem parametro
    
    public Produto(){
        
    }
    
    // criando um construtor com parametros
    
    public Produto( String nome, int qtde,double preco ){
        this.nome = nome;
        this.qtde = qtde;
        this.preco= preco;
    }
    
    //criando um metodo que compra um produto e aumenta a qtde
    
    public void comprar (int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender (int x{
        if (x <= this.qtde){
            this.qtde = this.qtde - x;
        }
        else System.out.printIn("Sem estoque")
    }
      
}
