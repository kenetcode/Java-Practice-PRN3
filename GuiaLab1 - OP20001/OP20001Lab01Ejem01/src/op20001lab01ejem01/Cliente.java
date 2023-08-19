/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab01ejem01;

/**
 *
 * @author kenetcode
 */
public class Cliente {
    
    private int codigo;
    private String razonSocial;
    
    public Cliente(int p_codigo, String p_razonSocial){
        
        setCodigo(p_codigo);
        setRazonSocial(p_razonSocial);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }
    
}
