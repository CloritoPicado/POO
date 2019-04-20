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
    
    String nombre;
    String correo;

    public Persona(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }

    public Persona() {
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
