
package br.edu.fatecfranca.prova1;

public class Apto extends Imovel {
    private int nro;
    
    public Apto(){
        super();
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }

    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }
    
    @Override
    public String toString() {
        return "Apto: " + "Número: " + nro + super.toString();
    }
    
    
    
}