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
public class Direccion {
    
    String provincia;
    String canton;
    String distrito = "";
    String senhas;

    public Direccion() {
    }

    public Direccion(String provincia, String canton, String distrito, String senhas) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.senhas = senhas;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getSenhas() {
        return senhas;
    }

    public void setSenhas(String senhas) {
        this.senhas = senhas;
    }
    
    
    
}
