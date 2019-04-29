/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.time.LocalDate;
import java.util.*;

/**
 *
 * @author Patrixito
 */
public class ServicioMantenimiento {
    
    int identificador;
    ETipoMantenimiento tipo;
    LocalDate fechaInicio;
    LocalDate fechaFinal; 
    float montoPagado;
    String detalle;
    String empresa;

    public ServicioMantenimiento() {
    }

    public ServicioMantenimiento(int identificador, ETipoMantenimiento tipo, LocalDate fechaInicio, LocalDate fechaFinal, float montoPagado, String detalle, String empresa) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoPagado = montoPagado;
        this.detalle = detalle;
        this.empresa = empresa;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public ETipoMantenimiento getTipo() {
        return tipo;
    }

    public void setTipo(ETipoMantenimiento tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public float getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(float montoPagado) {
        this.montoPagado = montoPagado;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
}
