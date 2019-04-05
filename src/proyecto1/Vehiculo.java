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
public class Vehiculo {
    
    EEstado estado;
    boolean rentado;
    String placa;
    Date anho;
    EEstilo estilo;
    String color;
    String marca;
    int capacidad;
    float kilometraje;
    int numPuertas;
    String numVim;
    int mpg;
    ESede sedePertenencia;
    float costoPorDia;
    int capacidadMaletas;
    ETransmision transmision;
    List<ServicioMantenimiento> historialServiciosMantenimiento;
    List<CoordenadasVehiculo> listaCoordenadas;

    public Vehiculo() {
    }

    public Vehiculo(EEstado estado, boolean rentado, String placa, Date anho, EEstilo estilo, String color, String marca, int capacidad, float kilometraje, int numPuertas, String numVim, int mpg, ESede sedePertenencia, float costoPorDia, int capacidadMaletas, ETransmision transmision, List<ServicioMantenimiento> historialServiciosMantenimiento, List<CoordenadasVehiculo> listaCoordenadas) {
        this.estado = estado;
        this.rentado = rentado;
        this.placa = placa;
        this.anho = anho;
        this.estilo = estilo;
        this.color = color;
        this.marca = marca;
        this.capacidad = capacidad;
        this.kilometraje = kilometraje;
        this.numPuertas = numPuertas;
        this.numVim = numVim;
        this.mpg = mpg;
        this.sedePertenencia = sedePertenencia;
        this.costoPorDia = costoPorDia;
        this.capacidadMaletas = capacidadMaletas;
        this.transmision = transmision;
        this.historialServiciosMantenimiento = historialServiciosMantenimiento;
        this.listaCoordenadas = listaCoordenadas;
    }

    public EEstado getEstado() {
        return estado;
    }

    public void setEstado(EEstado estado) {
        this.estado = estado;
    }

    public boolean isRentado() {
        return rentado;
    }

    public void setRentado(boolean rentado) {
        this.rentado = rentado;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Date getAnho() {
        return anho;
    }

    public void setAnho(Date anho) {
        this.anho = anho;
    }

    public EEstilo getEstilo() {
        return estilo;
    }

    public void setEstilo(EEstilo estilo) {
        this.estilo = estilo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public float getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(float kilometraje) {
        this.kilometraje = kilometraje;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getNumVim() {
        return numVim;
    }

    public void setNumVim(String numVim) {
        this.numVim = numVim;
    }

    public int getMpg() {
        return mpg;
    }

    public void setMpg(int mpg) {
        this.mpg = mpg;
    }

    public ESede getSedePertenencia() {
        return sedePertenencia;
    }

    public void setSedePertenencia(ESede sedePertenencia) {
        this.sedePertenencia = sedePertenencia;
    }

    public float getCostoPorDia() {
        return costoPorDia;
    }

    public void setCostoPorDia(float costoPorDia) {
        this.costoPorDia = costoPorDia;
    }

    public int getCapacidadMaletas() {
        return capacidadMaletas;
    }

    public void setCapacidadMaletas(int capacidadMaletas) {
        this.capacidadMaletas = capacidadMaletas;
    }

    public ETransmision getTransmision() {
        return transmision;
    }

    public void setTransmision(ETransmision transmision) {
        this.transmision = transmision;
    }

    public List<ServicioMantenimiento> getHistorialServiciosMantenimiento() {
        return historialServiciosMantenimiento;
    }

    public void setHistorialServiciosMantenimiento(List<ServicioMantenimiento> historialServiciosMantenimiento) {
        this.historialServiciosMantenimiento = historialServiciosMantenimiento;
    }

    public List<CoordenadasVehiculo> getListaCoordenadas() {
        return listaCoordenadas;
    }

    public void setListaCoordenadas(List<CoordenadasVehiculo> listaCoordenadas) {
        this.listaCoordenadas = listaCoordenadas;
    }
    
    
}
