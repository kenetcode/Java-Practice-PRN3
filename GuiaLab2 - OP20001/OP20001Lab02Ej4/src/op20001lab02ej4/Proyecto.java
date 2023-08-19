/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej4;
import java.util.ArrayList;

/**
 *
 * @author kenetcode
 */

public class Proyecto {
    private int numProy;
    private String nombreProy;
    private int cantFases;
    private int cantFaseFin;
    private ArrayList fases = new ArrayList();

    public Proyecto() {
    }

    public Proyecto(int numProy, String nombreProy, int cantFases, int cantFaseFin) {
        this.numProy = numProy;
        this.nombreProy = nombreProy;
        this.cantFases = cantFases;
        this.cantFaseFin = cantFaseFin;
    }

    public int getNumProy() {
        return numProy;
    }

    public void setNumProy(int numProy) {
        this.numProy = numProy;
    }

    public String getNombreProy() {
        return nombreProy;
    }

    public void setNombreProy(String nombreProy) {
        this.nombreProy = nombreProy;
    }

    public int getCantFases() {
        return cantFases;
    }

    public void setCantFases(int cantFases) {
        this.cantFases = cantFases;
    }

    public int getCantFaseFin() {

        return cantFaseFin;
    }

    public void setCantFaseFin(int cantFaseFin) {
        this.cantFaseFin = cantFaseFin;
    }

    public void agregarFase(Fase fase) {
        if (fase.isFinalizada() == true) {
            cantFases = cantFases + 1;
        } else {
            cantFaseFin = cantFaseFin + 1;
        }
        fases.add(fase);
    }

    public Fase getFase(int indice) {
        Fase fas;
        fas = (Fase) fases.get(indice);
        return new Fase(fas.getNumFase(), fas.getNombreFase(), fas.isFinalizada());
    }

    @Override
    public String toString() {
        String estado;
        if ((cantFases - cantFaseFin) == 0) {
            estado = "finalizada";
        } else {
            estado = "en proceso";
        }

        return "numProy = " + numProy + ",  nombreProy = " + nombreProy + ",  cantFases = " + cantFases + ",  cantFaseFin = " + cantFaseFin + ",  estado = " + estado + '}';
    }
}
