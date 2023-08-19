/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab01ejem01;

/**
 *
 * @author kenetcode
 */
public class Comprobante {
    
    private char tipo;
    private int numero;
    private Fecha fecha;
    
    public Comprobante(char p_tipo, int p_numero, Fecha p_fecha){
        
        setTipo(p_tipo);
        setNumero(p_numero);
        setFecha(p_fecha);
        
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
}
