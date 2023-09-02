/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

/**
 *
 * @author kenetcode
 */
public abstract class Empresa {
    
    private String nombre;

    public Empresa() {
           
        
    }
    
    
    public Empresa(String nombre) {
        
        setNombre(nombre);
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\n", getNombre());
    }

    
}
