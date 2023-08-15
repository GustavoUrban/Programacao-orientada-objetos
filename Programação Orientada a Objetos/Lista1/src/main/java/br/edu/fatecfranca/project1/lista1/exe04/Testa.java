/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.project1.lista1.exe04;

/**
 *
 * @author gondi
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Rio obj1 = new Rio(" Amazonas", 1.86,false);
        
        obj1.chover(0.54);
        obj1.ensolarar(0.3);
        
        Rio obj2 = new Rio("Tietê", 0.87,true);
        
        obj2.chover(0.8);
        obj2.ensolarar(0.4);
        
    }
    
}
