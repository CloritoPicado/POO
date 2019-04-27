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
public class Operador extends Persona{
    
    byte[] contrasenha; 

    public Operador() {
    }

    public Operador(byte[] contrasenha, String nombre, String correo, String identificacion) {
        super(nombre, correo,identificacion);
        this.contrasenha = contrasenha;
    }

    public Operador(byte[] contrasenha) {
        this.contrasenha = contrasenha;
    }

    public byte[] getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(byte[] contrasenha) {
        this.contrasenha = contrasenha;
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
