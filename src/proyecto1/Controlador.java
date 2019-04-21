/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrixito
 */
public class Controlador {

    public Controlador(){
       
        //escribirJSON(almacenarVehiculo(v),"vehiculos.json");
        //System.out.println(v.toString());
        Vehiculo v = new Vehiculo(EEstado.Activo, true, "BBB111", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        Vehiculo v2 = new Vehiculo(EEstado.Activo, true, "BBB112", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v);
        lista.add(v2);
        ListaVehiculos lVehiculos = new ListaVehiculos(lista);
        //serializador(lVehiculos);
        deserealizarVehiculo();
        deserealizarUbicacion();
        //leerJSON("vehiculo.json");

    }
    
    public void serializador(Object o, String archivo)
    {
        //Gson gson = new Gson();        
        try (Writer writer = new FileWriter("src/Argonautas/"+archivo)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(o, writer);
        } catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deserealizarVehiculo()
    {
        Gson gson = new Gson();

    try {

        BufferedReader br = new BufferedReader(
            new FileReader("src/Argonautas/vehiculos.json"));

        //convert the json string back to object
        ListaVehiculos v = gson.fromJson(br, ListaVehiculos.class);
        System.out.println(v.getlVehiculos().get(1));


    } catch (IOException e) {
        e.printStackTrace();
    }

    }
    
    public void deserealizarUbicacion()
    {
        Gson gson = new Gson();

    try {

        BufferedReader br = new BufferedReader(
            new FileReader("src/Argonautas/Distritos.json"));

        //convert the json string back to object
        Ubicacion ubicacion = gson.fromJson(br, Ubicacion.class);
        System.out.println(ubicacion.getProvincias().get(4).getTitle());


    } catch (IOException e) {
        e.printStackTrace();
    }

    }
             
    
    /*public void escribirJSON(JSONObject o, String archivo)
    {
        JSONParser jsonParser = new JSONParser();

        try {
            Object obj = jsonParser.parse(new FileReader("Argonautas/"+archivo));
            JSONArray jsonArray = new JSONArray();
            jsonArray.add(obj);
            jsonArray.add(o);
            FileWriter file = new FileWriter("Argonautas/"+archivo);
            file.write(jsonArray.toJSONString());
            file.flush();
            file.close();

        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
    }
    
    public void leerJSON(String archivo)
    {
        
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("Argonautas/"+archivo))
        {
            Object obj = jsonParser.parse(reader);
            JSONArray datos = (JSONArray) obj;
            
            System.out.println(datos);

 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
    
    
    
    public JSONObject almacenarVehiculo(Vehiculo v)
    {
        JSONObject objeto = new JSONObject(v.toMap());
        return objeto;

    }*/
    
}
