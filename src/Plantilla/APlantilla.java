/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Plantilla;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carlos Lopez
 */
public abstract class APlantilla {

    public int diferencia;

    public String templateMostrar() {

        Date hora = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(hora); // Configuramos la fecha que se recibe
        diferencia(calendar);
        
        Date resultado = calendar.getTime();
     
        SimpleDateFormat formatoHora = formato();

        return formatoHora.format(resultado);
    }

    public abstract SimpleDateFormat formato();

    public abstract void diferencia(Calendar calendar);
}
