/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej2;

import java.util.List;

/**
 *
 * @author kenetcode
 */
public class AbogadoDefensor {

    private String nombreAbogado;
    private String nombreBuffete;
    private double honorariosPorCaso;
    private boolean trabajaParaElEstado;
    private List<Audiencia> audiencias;

    public AbogadoDefensor() {

    }

    public String getNombreAbogado() {
        return nombreAbogado;
    }

    public void setNombreAbogado(String nombreAbogado) {
        this.nombreAbogado = nombreAbogado;
    }

    public String getNombreBuffete() {
        return nombreBuffete;
    }

    public void setNombreBuffete(String nombreBuffete) {
        this.nombreBuffete = nombreBuffete;
    }

    public double getHonorariosPorCaso() {
        return honorariosPorCaso;
    }

    public void setHonorariosPorCaso(double honorariosPorCaso) {
        this.honorariosPorCaso = honorariosPorCaso;
    }

    public String getTrabajaParaElEstado() {
        if (trabajaParaElEstado) {
            return "SI";
        } else {
            return "NO";
        }

    }

    public void setTrabajaParaElEstado(boolean trabajaParaElEstado) {
        this.trabajaParaElEstado = trabajaParaElEstado;
    }

    public List<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }
    
    public void mostrarAudiencias(){
        System.out.println("\nLista de Audiencias: \n");
        for(Audiencia audi : audiencias){
            System.out.println(audi);
        }
    }

    @Override
    public String toString() {
        return String.format("\nABOGADO \nNombre: %s \nBuffete: %s \nHonorarios: $%.2f \nTrabaja para el Estado: %s", getNombreAbogado(), getNombreBuffete(), getHonorariosPorCaso(), getTrabajaParaElEstado());
    }

}
