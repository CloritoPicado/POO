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
public class ListaLicencias {
    
    List<Licencia> licencias;

    public ListaLicencias() {
    }

    public ListaLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }

    public List<Licencia> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<Licencia> licencias) {
        this.licencias = licencias;
    }
    
    
    
    
}
