/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;
import java.util.List;

/**
 *
 * @author kenetcode
 */
public class Operacion {
    
    private List<Paramedico> paramedicos; 
    private List<Medico> medicos;
    private String nombrePaciente;
    private String fecha;

    public Operacion(List<Paramedico> paramedicos, List<Medico> medicos, String nombrePaciente, String fecha) {
        setParamedicos(paramedicos);
        setMedicos(medicos);
        setNombrePaciente(nombrePaciente);
        setFecha(fecha);
    }
    
    
    public List<Paramedico> getParamedicos() {
        return paramedicos;
    }

    public void setParamedicos(List<Paramedico> paramedicos) {
        this.paramedicos = paramedicos;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    public boolean realizadaConExito(){
        return true;
    }
    
    public String imprimirListas(List<Paramedico> paramedicos, List<Medico> medicos){
        
        for(Paramedico paramedico : paramedicos){
            System.out.println(paramedico.toString());
        }
        
        for(Medico medico : medicos){
            System.out.println(medico.toString());
        }
        
        return "\n";
    }

    @Override
    public String toString() {
        
        
        return String.format("%sNombre del paciente: %s | Fecha de la Operacion: %s\n", imprimirListas(paramedicos, medicos), getNombrePaciente(), getFecha());
    }

}
