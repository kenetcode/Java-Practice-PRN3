/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

import java.util.List;

/**
 *
 * @author kenetcode
 */
public class Material implements Inventario{
    
    private String codigo;
    private String unidadDeMedida;
    private int existencias;
    
    
    public Material(String codigo, String unidadDeMedida){
        
        setCodigo(codigo);
        setUnidadDeMedida(unidadDeMedida);
        setExistencias(0);
        
    }
    
    public void aumentarExistencias(int cantidad){
        
    }
    
    public void disminuirExistencias(int cantidad){
        
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getUnidadDeMedida() {
        return unidadDeMedida;
    }

    public void setUnidadDeMedida(String unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return String.format("Codigo: %s Unidad De Medida: %s Existencias: %d", getCodigo(), getUnidadDeMedida(), getExistencias());
    }
    
    
    
}
