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
public class Ubicacion {
    
    private String title;
    private List<Provincia> provincias;

    public Ubicacion() {
    }

    public Ubicacion(List<Provincia> provincias) {
        this.provincias = provincias;
    }
    
    public Ubicacion(String title, List<Provincia> provincias) {
        this.title = title;
        this.provincias = provincias;
    }
    
    public String[] listaProvincias()
    {
        String[] resultado = new String[provincias.size()];
        int contador = 0;
        for (Provincia p : provincias) 
        { 
            resultado[contador] = p.getTitle();
            contador++;
        }
        
        return resultado;
    }
    
    public Provincia buscarProvincia(String s)
    {
        for(int a = 0; a < provincias.size(); a++)
        {
            if(provincias.get(a).getTitle().equals(s))
            {
                return provincias.get(a);
            }
        }
        
        return null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Provincia> getProvincias() {
        return provincias;
    }

    public void setProvincias(List<Provincia> provincias) {
        this.provincias = provincias;
    }
    
    
    
}
