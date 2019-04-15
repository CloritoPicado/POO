/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Patrixito
 */
public enum EEstilo {
    Compacto,
    Pickup,
    Intermedio,
    SUV,
    Minivan,
    Convertible,
    Economico;

    public static String[] toStringArray() {
        int contador = 0;
        String[] resultado = new String[EEstilo.values().length];
        for (EEstilo E : EEstilo.values())
        {
            resultado[contador] = E.toString();
            contador++;
        }
              
        return resultado;
    }
}


