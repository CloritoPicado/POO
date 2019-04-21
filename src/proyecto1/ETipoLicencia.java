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
public enum ETipoLicencia{
    
    A1,
    A2,
    A3,
    A4,
    B1,
    B2,
    B3,
    B4,
    C1,
    C2,
    D1,
    D2,
    D3,
    E1,
    E2;
    
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
