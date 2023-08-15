
package br.edu.fatecfranca.lista4;


public class Assistente extends Funcionario {
    
    private float horaextra;
    private String quemAssiste;

    public Assistente() {
        super();
    }

    
    public Assistente(float horaextra, String nome, String quemAssiste, String cpf, 
            int codigo, float salario, float cargaHoraria) {
        
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.horaextra = horaextra;
        this.quemAssiste = quemAssiste;
    }

    public float getHoraextra() {
        return horaextra;
    }

    public void setQuemAssiste(String quemAssiste) {
        this.quemAssiste = quemAssiste;
    }

    public String getQuemAssiste() {
        return quemAssiste;
    }

    public void setHoraextra(float horaextra) {
        this.horaextra = horaextra;
    }

    @Override
    public String toString() {
        return "Assistente{" + "horaextra=" + horaextra + ", quemAssiste=" + quemAssiste + super.toString() + '}'
                ;
    }
    @Override
    public float calculaSalario (){
        return this.salario + this.horaextra *(this.salario / this.cargaHoraria);
    }
    
    
    
}