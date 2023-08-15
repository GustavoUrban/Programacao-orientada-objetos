
package br.edu.fatecfranca.prova1;

public class Teste {

    public static void converteString(Imovel im){
        System.out.println(im.toString());
    }
    
    
    public static void main(String[] args) {
      
        
        Casa objCasa = new Casa(100, "Av. Presidente Vargas");
        converteString(objCasa);
        
        Apto objApto = new Apto(37, "Av Abraão Brickhman 1578");
        converteString(objApto);
    }
    
}