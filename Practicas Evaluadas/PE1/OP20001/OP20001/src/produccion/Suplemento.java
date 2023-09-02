/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

/**
 *
 * @author kenetcode
 */
public class Suplemento implements IEntradaSalida{
    
    private String codigo;
    private String descripcion;
    private int existencias;

    public Suplemento(String codigo, String descripcion) {
        setCodigo(codigo);
        setDescripcion(descripcion);
        setExistencias(0);
    }
    
    public void aumentarExistencias(int cantidad){
        existencias += cantidad;
    }
    
    public void disminuirExistencias(int cantidad){
        existencias -= cantidad;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getExistencias() {
        return existencias;
    }

    public void setExistencias(int existencias) {
        this.existencias = existencias;
    }

    @Override
    public String toString() {
        return String.format("Codigo de Suplemento: %s \nDescripcion: %s \nExistencias: %d", getCodigo(), getDescripcion(), getExistencias());
    }
    
}
