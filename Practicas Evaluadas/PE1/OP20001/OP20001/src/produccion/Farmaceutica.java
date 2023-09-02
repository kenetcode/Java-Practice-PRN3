/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author kenetcode
 */
public class Farmaceutica extends Empresa {
    
    private String nombre;
        List<Suplemento> suplementos = new ArrayList<Suplemento>();
    List<Equipo> equipos = new ArrayList<Equipo>();
    
    public Farmaceutica() {
        
    }
    
    public Farmaceutica(String nombre, String tipo) {
        super(tipo);
        setNombre(nombre);
    }
    
    public void producir(Equipo equipo, int cantidad) {
        
        equipo.producir(cantidad);
        
    }
    
    public void distribuir(Suplemento suplemento, int cantidad) {
        
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarSuplementos(Suplemento suplemento) {
        suplementos.add(suplemento);
    }
    
    public void getCantidadSuplementos() {
        
        System.out.println("\nEl numero de elementos que tiene la lista Suplemento es: " + suplementos.size());
        
    }
    
    public void agregarEquipo(Equipo equipo) {
        equipos.add(equipo);
    }
    
    public void getCantidadEquipos() {
        
        System.out.println("\nEl numero de elementos que tiene la lista Equipos es: " + equipos.size());
        
    }
    
    @Override
    public String toString() {
        return String.format("\nNombre Farmaceutica: %s Tipo: %s", getNombre(), getTipo());
    }
    
}
