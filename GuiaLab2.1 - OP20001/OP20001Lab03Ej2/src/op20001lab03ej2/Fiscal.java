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
public class Fiscal {
    private NomEmpleadoJusticia nombreFiscal;
    private int casosGanados;
    private List<Audiencia> audiencias;
    
    public Fiscal(){
        
    }

    public NomEmpleadoJusticia getNombreFiscal() {
        return nombreFiscal;
    }

    public void setNombreFiscal(NomEmpleadoJusticia nombreFiscal) {
        this.nombreFiscal = nombreFiscal;
    }

    public int getCasosGanados() {
        return casosGanados;
    }

    public void setCasosGanados(int casosGanados) {
        this.casosGanados = casosGanados;
    }

    public List<Audiencia> getAudiencias() {
        return audiencias;
    }

    public void setAudiencias(List<Audiencia> audiencias) {
        this.audiencias = audiencias;
    }
    
}
