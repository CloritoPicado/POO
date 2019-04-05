/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.*;

/**
 *
 * @author Patrixito
 */
public class Licencia {
    
    int numero;
    Date fechaEmision;
    Date fechaExpiracion;
    ETipoLicencia tipo;
    String imagen;

    public Licencia() {
    }
        

    public Licencia(int numero, Date fechaEmision, Date fechaExpiracion, ETipoLicencia tipo, String imagen) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }

    public ETipoLicencia getTipo() {
        return tipo;
    }

    public void setTipo(ETipoLicencia tipo) {
        this.tipo = tipo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    
    
    
}
