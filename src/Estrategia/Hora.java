/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import Estrategia.Hora_USA;
import Estrategia.Hora_España;

/**
 *
 * @author Carlos Lopez
 */
public class Hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContextoHora c = new ContextoHora();
        c.setEstrategia(new Hora_España());
        System.out.println(c.mostrar());
        
    }

}
