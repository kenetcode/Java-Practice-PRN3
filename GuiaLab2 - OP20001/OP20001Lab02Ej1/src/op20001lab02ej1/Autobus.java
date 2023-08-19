/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej1;

/**
 *
 * @author kenetcode
 */

public class Autobus extends Vehiculo {
    protected int numPlazas;

    public Autobus(int numPlazas, String marca, String modelo, double precioAlquiler) {
        super(marca, modelo, precioAlquiler);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
        System.out.print("\t" + "AB" + "\t" + "Plazas: " + numPlazas);
    }
}
