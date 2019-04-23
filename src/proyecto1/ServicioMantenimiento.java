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
public class ServicioMantenimiento {
    
    int identificador;
    ETipoMantenimiento tipo;
    Date fechaInicio;
    Date fechaFinal; 
    float montoPagado;
    String detalle;
    EmpresaMantenimiento empresa;
    Vehiculo vehiculo;

    public ServicioMantenimiento() {
    }

    public ServicioMantenimiento(int identificador, ETipoMantenimiento tipo, Date fechaInicio, Date fechaFinal, float montoPagado, String detalle, EmpresaMantenimiento empresa, Vehiculo vehiculo) {
        this.identificador = identificador;
        this.tipo = tipo;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.montoPagado = montoPagado;
        this.detalle = detalle;
        this.empresa = empresa;
        this.vehiculo = vehiculo;
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

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
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

    public EmpresaMantenimiento getEmpresa() {
        return empresa;
    }

    public void setEmpresa(EmpresaMantenimiento empresa) {
        this.empresa = empresa;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    
}
