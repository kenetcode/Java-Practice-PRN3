package op20001lab03ej1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 *
 * @author kenetcode
 */
public class Prueba {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enfermera enfermera = new Enfermera(9, true, 5567, "Paola", "Jefa de enfermeras", "F");
        
        Paramedico paramedico1 = new Paramedico(4,"Decimo",6456,"Oscar","Paramedico1", "M");
        Paramedico paramedico2 = new Paramedico(5, "Cuarto", 6783, "Daniel", "Paramedico2", "M");
        Paramedico paramedico3 = new Paramedico(7,"Septimo", 8972, "Andrea", "Paramedico3", "F");
        
        Medico medico1 = new Medico(true, "Cirujano", 7638, "Estefan", "Medico secundario", "M");
        Medico medico2 = new Medico(false, "Cirujana", 5672, "Lisbeth", "Medico principal", "F");
        
        List<Paramedico> paramedicos = new ArrayList<Paramedico>();
        paramedicos.add(paramedico1);
        paramedicos.add(paramedico2);
        paramedicos.add(paramedico3);
        
        List<Medico> medicos = new ArrayList<Medico>();
        medicos.add(medico1);
        medicos.add(medico2);
        
        Operacion operacion = new Operacion(paramedicos, medicos, "Victor Calles", "23/12/2029");
    
        System.out.println(enfermera);
        System.out.println(operacion);
        
    }
    
}
