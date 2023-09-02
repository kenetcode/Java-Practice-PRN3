/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produccion;

/**
 *
 * @author kenetcode
 */
public class Prueba {

    public static void main(String[] args) {
        
        Farmaceutica farmaceutica2 = new Farmaceutica();
        farmaceutica2.setNombre("Pinedas");
        farmaceutica2.setTipo("Medica");
        
        Farmaceutica farmaceutica1 = new Farmaceutica("Castañeda", "Medica");
        
        Suplemento suplemento = new Suplemento("AY67", "Anti Estres");
        
        Equipo equipo1 = new Equipo();
        equipo1.setCodigo("TG34");
        equipo1.setSuplemento(suplemento);
        
        Equipo equipo2 = new Equipo();
        equipo2.setCodigo("YM78");
        equipo2.setSuplemento(suplemento);

        
        farmaceutica1.agregarEquipo(equipo1);
        farmaceutica1.agregarEquipo(equipo2);
        
        farmaceutica1.agregarSuplementos(suplemento);
        
        
        farmaceutica2.agregarEquipo(equipo1);
        farmaceutica2.agregarEquipo(equipo2);
        
        farmaceutica2.agregarSuplementos(suplemento);
        
        equipo1.producir(30);
        equipo2.producir(50);
        
        suplemento.aumentarExistencias(25);
        
        System.out.println(farmaceutica1);
        
        farmaceutica1.getCantidadEquipos();
        farmaceutica1.getCantidadSuplementos();
        
        System.out.println(farmaceutica2);
        
        farmaceutica2.getCantidadEquipos();
        farmaceutica2.getCantidadSuplementos();
        
    }

}
