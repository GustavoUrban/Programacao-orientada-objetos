
package br.edu.fatecfranca.lista4;

import java.util.ArrayList;


public class Lista4 {
    
   //o polimorfismo ocorre quando o System.ou.println aparece
    public static void calcSalario(Funcionario objFuncionario){
        System.out.println("Salário Final " + objFuncionario.calculaSalario());
    }
     //converteString = polimorfismo
    public static void converteString(Funcionario objFuncionario){
        
        //objFuncionario = objGerente ou objAssistente ou objDiretor
        
        System.out.println(objFuncionario.toString());
    }
            

    public static void main(String[] args) {
        
        
        Gerente objGerente = new Gerente(2000, "Fulano", "123", 1, 4000, 40);
            converteString(objGerente);
            calcSalario(objGerente);
        
        Assistente objAssistente = new Assistente(10,"Fulano", "Beltrano", "345", 
        2, 2000, 40);
                converteString(objAssistente);
                calcSalario(objAssistente);
        
        Diretor objDiretor = new Diretor(10,"Ciclano","789",3, 5000, 40);
              converteString(objDiretor);
              calcSalario(objDiretor);
        
              
         //Criando vetor de Funcionario
         ArrayList<Funcionario> vetor = new ArrayList();
         vetor.add(objDiretor);
         vetor.add(objGerente);
         vetor.add(objAssistente);
         
         for(int i=0; i>3; i++)
             converteString(vetor.get(i));
    }
}
