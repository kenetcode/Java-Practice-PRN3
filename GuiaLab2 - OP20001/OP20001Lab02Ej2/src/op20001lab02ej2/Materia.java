/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab02ej2;

/**
 *
 * @author kenetcode
 */
public class Materia {

    private String codigo;
    private Materia materiaRequisito;

    public Materia() {
    }

    public Materia(String codigo, Materia materiaRequisito) {
        this.codigo = codigo;
        this.materiaRequisito = materiaRequisito;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Materia getMateriaRequisito() {
        return materiaRequisito;
    }

    public void setMateriaRequisito(Materia materiaRequisito) {
        this.materiaRequisito = materiaRequisito;
    }

    @Override
    public String toString() {
        String cadena;
        if (materiaRequisito == null) {
            cadena = "Materia: " + codigo + "\n";
        } else {
            cadena = "Materia: " + codigo + " Tiene requisito: " + materiaRequisito.toString();
        }
        return cadena;
    }
}
