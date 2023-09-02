/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

/**
 *
 * @author kenetcode
 */
public class Equipo {
    
    private String codigo;
    private int unidadesProducidas;
    private Suplemento suplemento;
    
    public Equipo() {
        
        setUnidadesProducidas(0);
        
    }
    
    public void producir(int cantidad) {
        setUnidadesProducidas(cantidad);
        suplemento.aumentarExistencias(cantidad);
    }
    
    public String getCodigo() {
        return codigo;
    }
    
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public int getUnidadesProducidas() {
        return unidadesProducidas;
    }
    
    public void setUnidadesProducidas(int unidadesProducidas) {
        this.unidadesProducidas = unidadesProducidas;
    }
    
    public Suplemento getSuplemento() {
        return suplemento;
    }
    
    public void setSuplemento(Suplemento suplemento) {
        this.suplemento = suplemento;
    }
    
    @Override
    public String toString() {
        return suplemento.toString() + String.format("\nCodigo de Equipo: %s \nUnidades Producidas: %d", getCodigo(), getUnidadesProducidas());
    }
    
}
