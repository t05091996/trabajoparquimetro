/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_parquimetro;

// se importan las clases propias de java
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author Admin
 */
public class Funciones {

    public Funciones() {
    }
    /**
     * valida que el rut se valido/correcto
     * @param rut parametro de entrada puede ser en distintos formatos
     * @return verdadero o falso (valido o invalido)
     */
    public boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut = rut.toUpperCase();
            rut = rut.replace(".", "");
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);
            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }

       /**
     * calcula la hora restante o los minutos que pasaron desde a hacia b
     *
     * @param a hora de entrada
     * @param b hora de salida
     * @return diferencia en minutos
     */
    public Integer calcularMinutos(String a, String b) {
        LocalTime hora_e = LocalTime.parse(a);
        LocalTime hora_s = LocalTime.parse(b);
        long diff = ChronoUnit.MINUTES.between(hora_e, hora_s);
        Double h = diff / 60.00;
        Long m = diff % 60;
        LocalTime hf = LocalTime.of(h.intValue(), m.intValue());
        int hora = 60 * hf.getHour();
        return hora + hf.getMinute();
    }

}
