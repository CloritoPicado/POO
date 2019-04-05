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
public class Cliente extends Persona{
    
    int cedula;
    Direccion direccion;
    int telefono;
    Licencia licencia;

    public Cliente() {
        
    }

    public Cliente(int cedula, Direccion direccion, int telefono, Licencia licencia, String nombre, String correo) {
        super(nombre, correo);
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.licencia = licencia;
    }

    public Cliente(int cedula, Direccion direccion, int telefono, Licencia licencia) {
        this.cedula = cedula;
        this.direccion = direccion;
        this.telefono = telefono;
        this.licencia = licencia;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Licencia getLicencia() {
        return licencia;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }
    
    
}
