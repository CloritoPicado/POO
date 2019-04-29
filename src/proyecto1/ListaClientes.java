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
public class ListaClientes {
    
    List<Cliente> clientes = new ArrayList<>();

    public ListaClientes() {
    }

    public ListaClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public boolean isRepetido(String s)
    {
        for (Cliente c : clientes) 
        { 
            if(c.getIdentificacion().equals(s))
            {
                return true;
            }
        }
        return false;
    }
    
    public Cliente buscarCliente(String s)
    {
        for(int a = 0; a < clientes.size(); a++)
        {
            if(clientes.get(a).getIdentificacion().equals(s))
            {
                return clientes.get(a);                
            }
        }
        
        return null;
    }
    
    
    
}
