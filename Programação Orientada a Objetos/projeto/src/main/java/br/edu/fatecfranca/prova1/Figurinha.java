package br.edu.fatecfranca.prova1;

public class Figurinha {
    
    private int id;
    private String nome;
    private boolean especial;

    public Figurinha(){
        
    }
    public Figurinha(int id, String nome, boolean especial) {
        this.id = id;
        this.nome = nome;
        this.especial = especial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return """
               Figurinha:
                Nome:""" + nome + "\n ID:" + id +  "\n Especial:" + especial + '}';
    }
    
    
}