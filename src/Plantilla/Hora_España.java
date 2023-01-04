/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plantilla;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author Carlos Lopez
 */
public class Hora_España extends APlantilla{

    @Override
    public SimpleDateFormat formato() {
       SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");
       return formatoHora;
    }

    @Override
    public void diferencia(Calendar calendar) {
        calendar.add(Calendar.HOUR, 2);
    }

    public Hora_España() {
    }
    
}
