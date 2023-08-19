/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej3;
import java.util.ArrayList;

/**
 *
 * @author kenetcode
 */


public class Pieza {
    private int existencia;
    private Fabricante fabricantes;
    private ArrayList listaMovimientos = new ArrayList();

    public Pieza(int existencia, Fabricante fabricantes) {
        this.existencia = existencia;
        this.fabricantes = fabricantes;
    }

    public Pieza(int existencia) {
        this.existencia = existencia;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Fabricante getFabricantes() {
        return fabricantes;
    }

    public void setFabricantes(Fabricante fabricantes) {
        this.fabricantes = fabricantes;
    }

    public void comprar(int cant) {
        Movimiento mov = new Movimiento("compra", cant);
        listaMovimientos.add(mov);
        existencia = existencia + cant;
    }

    public void vender(int cant) {
        Movimiento mov = new Movimiento("venta", cant);
        listaMovimientos.add(mov);
        existencia = existencia - cant;
    }

    @Override
    public String toString() {
        return "Fabricante: " + fabricantes.toString() + "\tMovimientos: " + listaMovimientos.toString() + "\t\tExistencia: " + existencia;
    }
}
