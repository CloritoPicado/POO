/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Iterator;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
/**
 *
 * @author Francisco
 */
/*                String razonSocial;
                double cedulaJuridica;
                int telefono;
                Direccion direccion;
*/
//Esqueleto del lector de JSON para las empresas de mantenimiento (Aun no funciona)
public class ReadJSONEmpresaMant {
 
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
 
        try {
 
            Object obj = parser.parse(new FileReader("/Users/<username>/Documents/file1.txt"));
 
            JSONObject jsonObject = (JSONObject) obj;

            String razonSocial = (String) jsonObject.get("razonSocial");
            String cedulaJuridica = (String) jsonObject.get("cedulaJuridica");
            String telefono = (String) jsonObject.get("telefono");
            String direccion = (String) jsonObject.get("direccion");
            JSONArray empresaList = (JSONArray) jsonObject.get("EmpresaMantenimiento");
 
            System.out.println("Razon Social: " + razonSocial);
            System.out.println("Cedula Juridica: " + cedulaJuridica);
            System.out.println("Telefono: " + telefono);
            System.out.println("Direccion : " + direccion);
            System.out.println("\nEmpresa Mantenimiento:");
            Iterator<String> iterator = empresaList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (FileNotFoundException e) {
        }
    }
}
