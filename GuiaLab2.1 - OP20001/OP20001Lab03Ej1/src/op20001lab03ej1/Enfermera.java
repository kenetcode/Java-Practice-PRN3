/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;

/**
 *
 * @author kenetcode
 */
public class Enfermera extends PersonalMedico {

    private int añosDeExperiencia;
    private boolean estaEmbarazada;

    public Enfermera(int añosDeExperiencia, boolean estaEmbarazada, int identificacion, String nombre, String cargoEnHospital, String sexo) {
        super(identificacion, nombre, cargoEnHospital, sexo);
        setAñosDeExperiencia(añosDeExperiencia);
        setEstaEmbarazada(estaEmbarazada);
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getEstaEmbarazada() {
        if(estaEmbarazada){
            return "Si";
        }
        else{
            return "No";
        }
    }

    public void setEstaEmbarazada(boolean estaEmbarazada) {
        this.estaEmbarazada = estaEmbarazada;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Años de experiencia: %d | Embarazada: %s\n", getAñosDeExperiencia(), getEstaEmbarazada());
    }
    
    
}
