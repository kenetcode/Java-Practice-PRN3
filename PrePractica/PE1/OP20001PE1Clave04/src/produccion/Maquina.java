/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

/**
 *
 * @author kenetcode
 */
public class Maquina {
    
    private String codigo;
    private int unidadesProducidas;
    private Material material;
    
    
    public Maquina(){
        setUnidadesProducidas(0);
    }
    
    public void producir(int cantidad){
       unidadesProducidas += cantidad;
       material.aumentarExistencias(cantidad);
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

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return material.toString() + String.format("Codigo: %s Unidades Producidas: %d", getCodigo(), getUnidadesProducidas());
    }

}
