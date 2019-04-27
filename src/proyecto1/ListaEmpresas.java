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
public class ListaEmpresas {
    List<EmpresaMantenimiento> empresas = new ArrayList<>();

    public ListaEmpresas() {
    }

    public ListaEmpresas(List<EmpresaMantenimiento> empresas) {
        this.empresas = empresas;
    }

    public List<EmpresaMantenimiento> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<EmpresaMantenimiento> empresas) {
        this.empresas = empresas;
    }
    
    
    
}
