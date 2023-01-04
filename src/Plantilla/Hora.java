/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plantilla;

/**
 *
 * @author Carlos Lopez
 */
import Plantilla.Hora_España;
import Plantilla.Hora_USA;

public class Hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hora_USA u = new Hora_USA();
        System.out.println(u.templateMostrar());
    }
    
}
