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
public class Reserva {
    
    Cliente cliente;
    Vehiculo vehiculo;
    int numReserva;
    Operador operador;
    List<ServiciosOpcionales> serviciosOpcionales;
    LocalDate fechaInicio;
    LocalDate fechaFinal;
    ESede sedeInicio;
    ESede sedeFinal;

    public Reserva() {
    }

    public Reserva(Cliente cliente, Vehiculo vehiculo, int numReserva, Operador operador, List<ServiciosOpcionales> serviciosOpcionales, LocalDate fechaInicio, LocalDate fechaFinal, ESede sedeInicio, ESede sedeFinal) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.numReserva = numReserva;
        this.operador = operador;
        this.serviciosOpcionales = serviciosOpcionales;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
        this.sedeInicio = sedeInicio;
        this.sedeFinal = sedeFinal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public Operador getOperador() {
        return operador;
    }

    public void setOperador(Operador operador) {
        this.operador = operador;
    }

    public List<ServiciosOpcionales> getServiciosOpcionales() {
        return serviciosOpcionales;
    }

    public void setServiciosOpcionales(List<ServiciosOpcionales> serviciosOpcionales) {
        this.serviciosOpcionales = serviciosOpcionales;
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

    public ESede getSedeInicio() {
        return sedeInicio;
    }

    public void setSedeInicio(ESede sedeInicio) {
        this.sedeInicio = sedeInicio;
    }

    public ESede getSedeFinal() {
        return sedeFinal;
    }

    public void setSedeFinal(ESede sedeFinal) {
        this.sedeFinal = sedeFinal;
    }
    
    
}
