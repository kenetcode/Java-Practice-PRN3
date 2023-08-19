/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab01ejem01;

/**
 *
 * @author kenetcode
 */
public class Producto {
    
    private int codigo;
    private String descripcion;
    private float precio;
    
    public Producto(int p_codigo, String p_descripcion, float p_precio){
        
        setCodigo(p_codigo);
        setDescripcion(p_descripcion);
        setPrecio(p_precio);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
  
}
