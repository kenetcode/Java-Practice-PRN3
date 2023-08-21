/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op20001lab03ej2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenetcode
 */
public class OP20001Lab03Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        List<Audiencia> audienciasFiscal = new ArrayList<Audiencia>();
        List<Audiencia> audienciasAbogado = new ArrayList<Audiencia>();
        
        Audiencia audiencia1 = new Audiencia();
        audiencia1.setNombreCaso("La ciudad de San Salvador contra Carlos Villamar");
        audiencia1.setFechaAudiencia("7/11/2019");
        
        Audiencia audiencia2 = new Audiencia();
        audiencia2.setNombreCaso("Pedidios Ya Contra Hugo App");
        audiencia2.setFechaAudiencia("10/1/2021");
        
        Audiencia audiencia3 = new Audiencia();
        audiencia3.setNombreCaso("Despido injustificado");
        audiencia3.setFechaAudiencia("30/12/2013");
        
        audienciasFiscal.add(audiencia2);
        audienciasFiscal.add(audiencia1);
        
        Fiscal fiscal1 = new Fiscal();
        fiscal1.setNombreFiscal("Martin Gerra");
        fiscal1.setCasosGanados(10);
        fiscal1.setAudiencias(audienciasFiscal);
        
        AbogadoDefensor abogado1 = new AbogadoDefensor();
        abogado1.setNombreAbogado("Harvey Specter");
        abogado1.setNombreBuffete("Pearson Specter Litt");
        abogado1.setHonorariosPorCaso(5000);
        abogado1.setTrabajaParaElEstado(false);
        
        audienciasAbogado.add(audiencia2);
        audienciasAbogado.add(audiencia3);
        abogado1.setAudiencias(audienciasAbogado);
        
        System.out.println(fiscal1);
        fiscal1.mostrarAudiencias();
        
        System.out.println(abogado1);
        abogado1.mostrarAudiencias();
    }
    
}
