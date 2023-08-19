/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab01ejem01;

/**
 *
 * @author kenetcode
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anio;

    public Fecha(int p_dia, int p_mes, int p_anio) {
        
        setDia(p_dia);
        setMes(p_mes);
        setAnio(p_anio);

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

}
