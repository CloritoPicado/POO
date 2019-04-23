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
    
    String contrasenha; 

    public Operador() {
    }

    public Operador(String contrasenha, String nombre, String correo, int identificacion) {
        super(nombre, correo,identificacion);
        this.contrasenha = contrasenha;
    }

    public Operador(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
        
    
}
