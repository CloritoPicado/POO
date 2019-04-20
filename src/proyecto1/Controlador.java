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
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


/**
 *
 * @author Patrixito
 */
public class Controlador {

    public Controlador(){
        Vehiculo v = new Vehiculo(EEstado.Activo, true, "BBB111", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        escribirJSON(almacenarVehiculo(v));
        System.out.println(v.toString());
       // leerJSON("vehiculo.json");

    }
    
    public void escribirJSON(JSONObject o)
    {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("Argonautas/Distritos.json"));
            JSONArray jsonArray = (JSONArray)obj;
            jsonArray.add(o);
            FileWriter file = new FileWriter("Argonautas/vehiculo.json");
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public void leerJSON(String archivo)
    {
        /*InputStream is = null;
        try {
            is = new FileInputStream("Argonautas/" + archivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        JSONTokener tokener = new JSONTokener(is);
        JSONObject object = new JSONObject(tokener);
        System.out.println("Estado  : " + object.getString("estado"));
        System.out.println("Rentado: " + object.getBoolean("rentado"));
        System.out.println("Placa : " + object.getString("placa"));
        System.out.println("Año : " + object.getInt("anho"));*/
        
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("Argonautas/vehiculo.json"));
            JSONArray jsonArray = (JSONArray)obj;

            System.out.println(jsonArray);

            JSONObject student1 = new JSONObject();
            student1.put("name", "BROCK");
            student1.put("age", new Integer(3));

            JSONObject student2 = new JSONObject();
            student2.put("name", "Joe");
            student2.put("age", new Integer(4));

            jsonArray.add(student1);
            jsonArray.add(student2);

            System.out.println(jsonArray);

            FileWriter file = new FileWriter("D:\\student.json");
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }

    }
    
    
    
    public JSONObject almacenarVehiculo(Vehiculo v)
    {
        JSONObject objeto = new JSONObject(v.toMap());
        return objeto;

    }
    
}
