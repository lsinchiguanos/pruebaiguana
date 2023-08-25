package ec.iguana.leslie.sinchiguano.utils;

import ec.iguana.leslie.sinchiguano.enums.MensajeTipo;

public class MensajesError {

    public static String getMensajeError(MensajeTipo mensajeTipo){
        String mensaje = "";
        switch (mensajeTipo){
            case SOLO_LETRAS -> mensaje = "Solo se aceptan letras";
            case SOLO_NUMERO -> mensaje = "Solo se aceptan números";
            case CAMPO_REQUERIDO -> mensaje = "Campo es requerido";
            case FORMATO_INCORRECTO -> mensaje = "Formato incorrecto";
            case MINIMO -> mensaje = "Valor no debe ser menor a ";
            case MAXIMO -> mensaje = "Valor debe ser maximo a ";
            case MINIMO_CARACTERES -> mensaje = "Minimo de caracteres permitidos ";
            case MAXIMO_CARACTERES -> mensaje = "Maximo de caracteres permitidos ";
            default -> mensaje = "";

        }
        return mensaje;
    }

}
