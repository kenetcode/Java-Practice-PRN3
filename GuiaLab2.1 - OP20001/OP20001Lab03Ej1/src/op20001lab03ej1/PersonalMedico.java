/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab03ej1;

/**
 *
 * @author kenetcode
 */

public abstract class PersonalMedico implements AccionesEquipoMedico{
    
    private int  identificacion;
    private String nombre;
    private String cargoEnHospital;
    private String sexo;

    public PersonalMedico(int identificacion, String nombre, String cargoEnHospital, String sexo) {
        setIdentificacion(identificacion);
        setNombre(nombre);
        setCargoEnHospital(cargoEnHospital);
        setSexo(sexo);
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargoEnHospital() {
        return cargoEnHospital;
    }

    public void setCargoEnHospital(String cargoEnHospital) {
        this.cargoEnHospital = cargoEnHospital;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public void AtenderPaciente(){
        
    }
    
    @Override
    public boolean AusentarseConPermiso(){
        return true;
    }
    
    @Override
    public void ComerAHoraAsignada(){
        
    }
    
    @Override
    public void AsistirOperacion(){
        
    }

    @Override
    public String toString() {
        return String.format("Identificacion: %d | Nombre: %s | Cargo: %s | Sexo: %s\n", getIdentificacion(), getNombre(), getCargoEnHospital(), getSexo());
    }
    
    
    
}
