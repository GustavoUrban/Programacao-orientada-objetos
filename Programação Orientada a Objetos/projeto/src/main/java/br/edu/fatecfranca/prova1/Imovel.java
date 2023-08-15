
package br.edu.fatecfranca.prova1;

public class Imovel {
 
    protected String endereco;
    
    public Imovel(){
        
    }

    public Imovel(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel: " + "Endereco=" + endereco;
    }
    
    
}