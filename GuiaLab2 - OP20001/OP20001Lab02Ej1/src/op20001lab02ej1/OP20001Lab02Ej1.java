/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op20001lab02ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenetcode
 */
public class OP20001Lab02Ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Vehiculo> listaVehiculos = new ArrayList<Vehiculo>();

        listaVehiculos.add(new Vehiculo("Mercedes", "E", 55));
        listaVehiculos.add(new Autobus(20, "Mercedes", "M20", 100));
        listaVehiculos.add(new Turismo(4, "BNW", "525", 50));
        listaVehiculos.add(new Turismo(4, "Audio", "A4", 55));
        listaVehiculos.add(new Autobus(30, "Mercedes", "M10", 120));
        listaVehiculos.add(new Turismo(4, "VW", "Passat", 35));
        listaVehiculos.add(new Turismo(2, "Audi", "A3", 30));
        listaVehiculos.add(new Turismo(4, "Mercedes", "E", 60));
        listaVehiculos.add(new Vehiculo("Audi", "A3", 30));
        imprimirElementosLista(listaVehiculos);
    }
    
    private static void imprimirElementosLista(List<Vehiculo> arreglo) {
        for (Vehiculo vehiculo : arreglo) {
            vehiculo.imprimirAtributos();
        }

        System.out.print("\n");
    }
    
}