/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;

/**
 *
 * @author kenetcode
 */
public class Medico extends PersonalMedico {

    private boolean esExtranjero;
    private String especialidad;

    public Medico(boolean esExtranjero, String especialidad, int identificacion, String nombre, String cargoEnHospital, String sexo) {

        super(identificacion, nombre, cargoEnHospital, sexo);
        setEsExtranjero(esExtranjero);
        setEspecialidad(especialidad);
    }

    public String getEsExtranjero() {
        
        if(esExtranjero){
            return "Si";
        }
        else{
            return "No";
        }
    }

    public void setEsExtranjero(boolean esExtranjero) {
        this.esExtranjero = esExtranjero;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        
        return super.toString() + String.format("Estranjero: %s | Especialidad: %s\n", getEsExtranjero(), getEspecialidad());
    }

}
