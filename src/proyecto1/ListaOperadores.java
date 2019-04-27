/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrixito
 */
public class ListaOperadores {
    
    List<Operador> operadores = new ArrayList<>();

    public ListaOperadores() {
    }

    public ListaOperadores(List<Operador> operadores) {
        this.operadores = operadores;
    }

    public List<Operador> getOperadores() {
        return operadores;
    }

    public void setOperadores(List<Operador> operadores) {
        this.operadores = operadores;
    }
    
    public Operador buscarOperador(String correo)
    {
        for(int a = 0; a < operadores.size(); a++)
        {
            if(operadores.get(a).getCorreo().equals(correo))
            {
                return operadores.get(a);
            }
        }
          
        return null;
    }
    
    
    
}
