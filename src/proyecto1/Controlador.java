/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;
import com.google.gson.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.time.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Patrixito
 */
public class Controlador {
    
    ListaVehiculos listaVehiculos = new ListaVehiculos();
    ListaReservas listaReservas = new ListaReservas();
    ListaOperadores listaOperadores = new ListaOperadores();
    ListaEmpresas listaEmpresas = new ListaEmpresas();
    ListaClientes listaClientes = new ListaClientes();
    Ubicacion ubicacion = new Ubicacion();

    public Controlador(){
        
        deserealizarUbicacion();
        deserealizarVehiculo();
        deserealizarOperador();
        //System.out.println(listaVehiculos.getlVehiculos().get(0).getCapacidad());
       
        /*Vehiculo v = new Vehiculo(EEstado.Activo, true, "BBB111", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        Vehiculo v2 = new Vehiculo(EEstado.Activo, true, "BBB112", 2006, EEstilo.Compacto, "azul", "Hyundai", 5, 33000.0f, 4, "A1B2C3D4", 32, ESede.Alajuela, 2300.0f, 3, ETransmision.Automatica, null, null);
        List<Vehiculo> lista = new ArrayList<>();
        lista.add(v);
        lista.add(v2);
        ListaVehiculos lVehiculos = new ListaVehiculos(lista);
        serializador(lVehiculos, "vehiculos.json");*/
        
        //System.out.println(ubicacion.getProvincias().get(0).getTitle());
        
        
        /*
        LocalDate date = LocalDate.of(2019, Month.APRIL, 22);
        LocalDate date2 = LocalDate.of(2024, Month.APRIL, 22);
        
        
        
        Licencia l = new Licencia(112340123,date,date2,ETipoLicencia.B1, null);
        //(int cedula, Direccion direccion, int telefono, Licencia licencia, String nombre, String correo, int identificacion)
        //(String provincia, String canton, String distrito, String senhas)
        Direccion d = new Direccion("San José", "San José", "Uruca", "100 norte del palo de mango");
        
        Cliente c = new Cliente(d,22223333,l,"Mario Mario","mario@nintendo.com", "11234012");
        List<Cliente> clientes = new ArrayList<>();
        clientes.add(c);
        listaClientes.setClientes(clientes);
        
        serializador(listaClientes,"clientes.json");
        
        
        //deserealizarUbicacion();
    */

    }
    
    //Guarda en JSON un objeto o en un archivo en src/Argonautas/
    public void serializador(Object o, String archivo)
    {
        //Gson gson = new Gson();        
        try (Writer writer = new FileWriter("src/Argonautas/"+archivo)) {
            Gson gson = new GsonBuilder().create();
            gson.toJson(o, writer);
        } 
        catch (IOException ex) {
            Logger.getLogger(Controlador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Genera la lista de vehículos a partir del json de vehículos
    public void deserealizarVehiculo()
    {
        Gson gson = new Gson();

    try {

        BufferedReader br = new BufferedReader(
        new FileReader("src/Argonautas/vehiculos.json"));
        listaVehiculos = gson.fromJson(br, ListaVehiculos.class);
        } 
        catch (IOException e) {
            System.out.println(e);
        }

    }
    
    //Genera la lista de vehículos a partir del json de vehículos
    public void deserealizarOperador()
    {
        Gson gson = new Gson();

    try {

        BufferedReader br = new BufferedReader(
        new FileReader("src/Argonautas/operadores.json"));
        listaOperadores = gson.fromJson(br, ListaOperadores.class);
        } 
        catch (IOException e) {
            System.out.println(e);
        }

    }
    
    //Genera el objeto ubicacion que contiene la información de todos los distritos de Costa Rica
    public void deserealizarUbicacion()
    {
        Gson gson = new Gson();

    try {

        BufferedReader br = new BufferedReader(
        new FileReader("src/Argonautas/Distritos.json"));
        ubicacion = gson.fromJson(br, Ubicacion.class);
        } 
        catch (IOException e) {
            System.out.println(e);
        }

    }

    public ListaVehiculos getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ListaVehiculos listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public ListaReservas getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ListaReservas listaReservas) {
        this.listaReservas = listaReservas;
    }

    public ListaOperadores getListaOperador() {
        return listaOperadores;
    }

    public void setListaOperador(ListaOperadores listaOperador) {
        this.listaOperadores = listaOperador;
    }

    public ListaEmpresas getListaEmpresas() {
        return listaEmpresas;
    }

    public void setListaEmpresas(ListaEmpresas listaEmpresas) {
        this.listaEmpresas = listaEmpresas;
    }

    public ListaClientes getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ListaClientes listaClientes) {
        this.listaClientes = listaClientes;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    
    
}
