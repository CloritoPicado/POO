/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.io.Serializable;

/**
 *
 * @author Patrixito
 */
public enum ETipoServicio{
    Wifi_Ilimitado,
    Asistencia_en_Carretera,
    GPS,
    Asiento_para_ninho,
    Cobertura_danho_terceros;
    
    public static String[] toStringArray() {
        int contador = 0;
        String[] resultado = new String[values().length];
        for (Enum E : values())
        {
            resultado[contador] = E.toString();
            contador++;
        }
              
        return resultado;
    }
 
}
