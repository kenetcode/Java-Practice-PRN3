/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej1;

/**
 *
 * @author kenetcode
 */
public class Turismo extends Vehiculo {
    protected int numPuertas;

    public Turismo(int numPuertas, String marca, String modelo, double precioAlquiler) {
        super(marca, modelo, precioAlquiler);
        this.numPuertas = numPuertas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    @Override
    public void imprimirAtributos() {
        super.imprimirAtributos();
        System.out.print("\t" + "TUR" + "\t" + "Puertas: " + numPuertas);
    }
}
