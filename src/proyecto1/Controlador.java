/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;


/**
 *
 * @author Patrixito
 */
public class Controlador {

    public Controlador(){
        Vehiculo v = new Vehiculo(EEstado.Activo, true, "BBB111", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        escribirJSON(almacenarVehiculo(v));
        System.out.println(v.toString());
        leerJSON();

    }
    
    public void escribirJSON(JSONObject o)
    {
        try (FileWriter file = new FileWriter("employees.json",true)) {
 
            file.write(o.toString());
            file.flush();
 
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void leerJSON()
    {
        InputStream is = null;
        try {
            is = new FileInputStream("employees.json");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        System.out.println("Estado  : " + object.getString("estado"));
        System.out.println("Rentado: " + object.getBoolean("rentado"));
        System.out.println("Placa : " + object.getString("placa"));
        System.out.println("Año : " + object.getInt("anho"));

    }
    
    
    
    public JSONObject almacenarVehiculo(Vehiculo v)
    {
        JSONObject objeto = new JSONObject(v.toString());
        return objeto;

    }
    
}
