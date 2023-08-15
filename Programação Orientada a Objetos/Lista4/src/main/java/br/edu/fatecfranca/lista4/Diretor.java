
package br.edu.fatecfranca.lista4;

//Extends serve para receber herança, ou seja, tudo o que já esta em Funcionario.

import javax.swing.JOptionPane;

public class Diretor extends Funcionario {
    private float participacaoLucros;
    
    public Diretor(){
        super();
    }

    public Diretor(float participacaoLucros, String nome, String cpf, int codigo, float salario,
            float cargaHoraria
   ) {
        
        super(nome, cpf, codigo, salario, cargaHoraria);
        this.participacaoLucros = participacaoLucros;
    }

    public float getParticipacaoLucros() {
        return participacaoLucros;
    }

    public void setParticipacaoLucros(float participacaoLucros) {
        this.participacaoLucros = participacaoLucros;
    }

    @Override
    public String toString() {
        return "Diretor{" + "participacaoLucros=" + participacaoLucros + '}';
    }
    
    
    public float calculaSalario(){
        String lucro = JOptionPane.showInputDialog("Informe o Lucro da Empresa: ");
        float lucro2 = Float.parseFloat(lucro);
        return this.salario + (this.participacaoLucros * lucro2) / 100;
    }
    
}