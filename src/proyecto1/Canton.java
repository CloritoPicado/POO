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
public class Canton {
    private String title;
    private List<Distrito> distritos;

    public Canton(String title, List<Distrito> distritos) {
        this.title = title;
        this.distritos = distritos;       
    }

    public Canton() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Distrito> getDistritos() {
        return distritos;
    }

    public void setDistritos(List<Distrito> distritos) {
        this.distritos = distritos;
    }
    
    public String[] listaDistritos()
    {
        String[] resultado = new String[distritos.size()];
        int contador = 0;
        for (Distrito d : distritos) 
        { 
            resultado[contador] = d.getTitle();
            contador++;
        }
        
        return resultado;
    }
    
    public Distrito buscarCanton(String s)
    {
        for(int a = 0; a < distritos.size(); a++)
        {
            if(distritos.get(a).getTitle().equals(s))
            {
                return distritos.get(a);
            }
        }
        
        return null;
    }
    
    
    
    
}
