/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej1;

/**
 *
 * @author kenetcode
 */
public class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precioAlquiler;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, double precioAlquiler) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioAlquiler = precioAlquiler;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void imprimirAtributos() {
        System.out.print("\n" + " Modelo: " + marca + " " + modelo + "\t" + "Precio: " + precioAlquiler);
    }
}
