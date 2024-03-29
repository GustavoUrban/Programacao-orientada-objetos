package br.edu.fatecfranca.lista1;

// algo abstrato e serve de modelo para seus objetos
public class Produto {
    public String nome; // tipo de dado é String (uma classe)
    public int qtde; // tipo de dado é int (tipo primitivo)
    public double preco; // tipo de dado é double (tipo primitivo)
    
    // cria um método construtor
    public Produto(){
        
    }
    // cria um método construtor
    public Produto(String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    
    // método que compra um produto, aumentando sua qtde
    // método não retorna nada
    public void comprar(int x){
        this.qtde = this.qtde + x;
    }
    
    public void vender(int x){
        if (x <= this.qtde){
            this.qtde = this.qtde - x;
        }
        else System.out.println("Sem estoque");
    }
    //this representa o objeto que chama o metodo
    public void mostrar(){
        System.out.println( "Nome: " + this.nome + "Qtde: " + this.qtde + "Preco: " + this.preco);
    }
    
    public void subir(double x){
        this.preco = this.preco + x;
    }
    public void baixar(double x){
        if (x <= this.preco){
            this.preco =- x;
        }
        else System.out.println("Desconto impossivel");
    }
}