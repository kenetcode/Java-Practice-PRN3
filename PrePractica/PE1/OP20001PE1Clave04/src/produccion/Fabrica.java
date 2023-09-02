/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenetcode
 */
public class Fabrica extends Empresa{
    
    private String rubro;
    List<Maquina> maquinas = new ArrayList<>();
    List<Material> materiales = new ArrayList<>();
    
    public Fabrica(){
        
    }
    
    public Fabrica(String nombre, String rubro){
        super(nombre);
        setRubro(rubro);
    }

    public String getRubro() {
        return rubro;
    }

    public void setRubro(String rubro) {
        this.rubro = rubro;
    }
    
    public void producir(Maquina maquina, int cantidad){
        maquina.producir(cantidad);
    }
    
    public void distribuir(Material material, int cantidad){
        
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }
    
    

    public List<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(List<Material> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return materiales.toString() + maquinas.toString() + String.format("Rubro: %s", getRubro());
    }
    
    

}
