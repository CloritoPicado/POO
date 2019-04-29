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
    
    Direccion direccion;
    int telefono;
    Licencia licencia;

    public Cliente() {
        
    }

    public Cliente(Direccion direccion, int telefono, Licencia licencia, String nombre, String correo, String identificacion) {
        super(nombre, correo,identificacion);
        this.direccion = direccion;
        this.telefono = telefono;
        this.licencia = licencia;
    }

    public Cliente(int cedula, Direccion direccion, int telefono, Licencia licencia) {
        this.direccion = direccion;
        this.telefono = telefono;
        this.licencia = licencia;
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

    @Override
    public String getIdentificacion() {
        return identificacion;
    }

    @Override
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getCorreo() {
        return correo;
    }

    @Override
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
}
