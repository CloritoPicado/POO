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

    public Ubicacion(String title, List<Provincia> provincias) {
        this.title = title;
        this.provincias = provincias;
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
