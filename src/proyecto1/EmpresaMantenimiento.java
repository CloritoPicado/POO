/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author Patrixito
 */
public class EmpresaMantenimiento {
    
    String razonSocial;
    double cedulaJuridica;
    int telefono;
    Direccion direccion;

    public EmpresaMantenimiento() {
    }

    public EmpresaMantenimiento(String razonSocial, double cedulaJuridica, int telefono, Direccion direccion) {
        this.razonSocial = razonSocial;
        this.cedulaJuridica = cedulaJuridica;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double getCedulaJuridica() {
        return cedulaJuridica;
    }

    public void setCedulaJuridica(double cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    
    
}
