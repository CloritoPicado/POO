/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

import java.util.regex.Pattern;

/**
 *
 * @author Patrixito
 */
public class RegEx {
    
    
    public static void main(String[] args) {      
        System.out.println(new RegEx().chequearPlaca("AAA111"));
    }
    
    public boolean chequearNombre(String s)
    {
        final Pattern pattern = Pattern.compile("^[a-zA-ZàáâäãåąčćęèéêëėįìíîïłńòóôöõøùúûüųūÿýżźñçčšžÀÁÂÄÃÅĄĆČĖĘÈÉÊËÌÍÎÏĮŁŃÒÓÔÖÕØÙÚÛÜŲŪŸÝŻŹÑßÇŒÆČŠŽ∂ð ,.'-]+$");
        return pattern.matcher(s).matches();
        
    }
    
    public boolean chequearCorreo(String s)
    {
        final Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,8}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearID(String s)
    {
        final Pattern pattern = Pattern.compile("^[A-Z0-9-]+$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearContrasenha(char[] c)
    {
        String s = new String(c);
        final Pattern pattern = Pattern.compile("^.{8,}$");
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearTelefono(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9]{8,}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearRazonSocial(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9A-Z ]+$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearCedulaJuridica(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9]{10}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearAnho(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9]{4}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearKilometraje(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9]+$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearPrecio(String s)
    {
        final Pattern pattern = Pattern.compile("^[0-9]+.[0-9]+$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
    public boolean chequearPlaca(String s)
    {
        final Pattern pattern = Pattern.compile("^[A-Z]{3}[0-9]{3}$", Pattern.CASE_INSENSITIVE);
        return pattern.matcher(s).matches();
    }
    
}
