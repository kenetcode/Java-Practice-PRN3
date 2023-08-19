/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej4;

/**
 *
 * @author kenetcode
 */

public class Fase {
    private int numFase;
    private String nombreFase;
    private boolean finalizada;

    public Fase() {
    }

    public Fase(int numFase, String nombreFase, boolean finalizada) {
        this.numFase = numFase;
        this.nombreFase = nombreFase;
        this.finalizada = finalizada;
    }

    public int getNumFase() {
        return numFase;
    }

    public void setNumFase(int numFase) {
        this.numFase = numFase;
    }

    public String getNombreFase() {
        return nombreFase;
    }

    public void setNombreFase(String nombreFase) {
        this.nombreFase = nombreFase;
    }

    public boolean isFinalizada() {
        return finalizada;
    }

    public void setFinalizada(boolean finalizada) {
        this.finalizada = finalizada;
    }

    @Override
    public String toString() {
        return "NumFase=" + numFase + ", NombreFase=" + nombreFase + ", Finalizada=" + finalizada;
    }
}
