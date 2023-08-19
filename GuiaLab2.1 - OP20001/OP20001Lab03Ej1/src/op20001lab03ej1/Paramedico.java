/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;

/**
 *
 * @author kenetcode
 */
public class Paramedico extends PersonalMedico {

    private int añosDeExperiencia;
    private String turno;

    public Paramedico(int añosDeExperiencia, String turno, int identificacion, String nombre, String cargoEnHospital, String sexo) {

        super(identificacion, nombre, cargoEnHospital, sexo);
        setAñosDeExperiencia(añosDeExperiencia);
        setTurno(turno);
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

}
