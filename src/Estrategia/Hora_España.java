/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estrategia;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Carlos Lopez
 */
public class Hora_España implements IReloj{
    private final int diferencia = 12;

    private Date sumarRestarHorasFecha(Date fecha) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fecha); // Configuramos la fecha que se recibe
        calendar.add(Calendar.HOUR, diferencia);  // numero de horas a añadir, o restar en caso de horas<0

        return calendar.getTime(); // Devuelve el objeto Date con las nuevas horas añadidas
    }

    @Override
    public String mostrar() {
        Date hora = new Date();
        Date resultado = sumarRestarHorasFecha(hora);
        SimpleDateFormat formatoHora = new SimpleDateFormat("hh:mm:ss");

        return formatoHora.format(resultado);
    }
    
}
