
package br.edu.fatecfranca.prova1;

public class Liquidificador {

    private Liquidificador(int veloLiqui, boolean statusMotor) {
        this.veloLiqui = veloLiqui;
        this.statusMotor = statusMotor;
    }

    private Liquidificador() {
    }
    
    private int veloLiqui;
    private boolean statusMotor;

    private int getVeloLiqui() {
        return veloLiqui;
    }

    private void setVeloLiqui(int veloLiqui) {
        this.veloLiqui = veloLiqui;
    }

    private boolean isStatusMotor() {
        return statusMotor;
    }

    private void setStatusMotor(boolean statusMotor) {
        this.statusMotor = statusMotor;
    }
    
    
    private void ligado (){
       if(!this.statusMotor) {
           this.statusMotor = true;
       }
    }
    private void desligado(){
        this.statusMotor = false;
        if (this.veloLiqui > 0){
            this.veloLiqui = 0;
        }
    }
     private void velocidades(int x){
         if (this.statusMotor){
             this.veloLiqui += x;
     
         }
     }
}

