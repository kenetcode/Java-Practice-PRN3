/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej2;

/**
 *
 * @author kenetcode
 */
public class Audiencia {
    private String fechaAudiencia;
    private String nombreCaso;
    
    public Audiencia(){
        
    }

    public String getFechaAudiencia() {
        return fechaAudiencia;
    }

    public void setFechaAudiencia(String fechaAudienciaFecha) {
        this.fechaAudiencia = fechaAudienciaFecha;
    }

    public String getNombreCaso() {
        return nombreCaso;
    }

    public void setNombreCaso(String nombreCaso) {
        this.nombreCaso = nombreCaso;
    }
   

    @Override
    public String toString() {
        return String.format("Nombre del caso: %s | Fecha de la audiencia: %s\n", getNombreCaso(), getFechaAudiencia());
    }

}
