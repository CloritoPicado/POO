/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.List;

/**
 *
 * @author Patrixito
 */
public class Provincia {
    
    private String title;
    private List<Canton> cantones;

    public Provincia() {
    }

    public Provincia(String title, List<Canton> cantones) {
        this.title = title;
        this.cantones = cantones;
    }    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Canton> getCantones() {
        return cantones;
    }

    public void setCantones(List<Canton> cantones) {
        this.cantones = cantones;
    }
    
    public String[] listaCantones()
    {
        String[] resultado = new String[cantones.size()];
        int contador = 0;
        for (Canton c : cantones) 
        { 
            resultado[contador] = c.getTitle();
            contador++;
        }
        
        return resultado;
    }
    
    public Canton buscarCanton(String s)
    {
        for(int a = 0; a < cantones.size(); a++)
        {
            if(cantones.get(a).getTitle().equals(s))
            {
                return cantones.get(a);
            }
        }
        
        return null;
    }
    
    
    
}
