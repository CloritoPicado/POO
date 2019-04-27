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
public class Persona {
    
    String identificacion;
    String nombre;
    String correo;

    public Persona(String nombre, String correo, String identificacion) {
        this.nombre = nombre;
        this.correo = correo;
        this.identificacion = identificacion;
    }

    public Persona() {
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
        

    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getCorreo() {
        return correo;
    }

    protected void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "{\"Nombre\":\"" +nombre+ ",\"Correo\":\""+correo+"\"}";
    }
    
    
}
