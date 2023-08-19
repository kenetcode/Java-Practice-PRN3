/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;

/**
 *
 * @author kenetcode
 */
public class Enfermera extends PersonalMedico{
    private int añosDeExperiencia;
    private boolean estaEmbarazada;
    
    public Enfermera(){
        
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public boolean isEstaEmbarazada() {
        return estaEmbarazada;
    }

    public void setEstaEmbarazada(boolean estaEmbarazada) {
        this.estaEmbarazada = estaEmbarazada;
    }
}
