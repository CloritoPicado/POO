/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.nio.file.Path;
import java.time.LocalDate;


/**
 *
 * @author Patrixito
 */
public class Licencia {
    
    String identificacion;
    LocalDate fechaEmision;
    LocalDate fechaExpiracion;
    ETipoLicencia tipo;
    String imagen;

    public Licencia() {
    }
        

    public Licencia(String identificacion, LocalDate fechaEmision, LocalDate fechaExpiracion, ETipoLicencia tipo, String imagen) {
        this.identificacion = identificacion;
        this.fechaEmision = fechaEmision;
        this.fechaExpiracion = fechaExpiracion;
        this.tipo = tipo;
        this.imagen = imagen;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(LocalDate fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public LocalDate getFechaExpiracion() {
        return fechaExpiracion;
    }

    public void setFechaExpiracion(LocalDate fechaExpiracion) {
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
