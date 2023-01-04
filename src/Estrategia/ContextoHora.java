/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

/**
 *
 * @author Carlos Lopez
 */
public class ContextoHora {
    private IReloj estrategia;
    
    public ContextoHora() {
    }
    
    public String mostrar(){
        return estrategia.mostrar();
    }
    
    public void setEstrategia(IReloj estrategia){
        this.estrategia = estrategia;
    }

    
}
