/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op20001lab02ej2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kenetcode
 */
public class OP20001Lab02Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Materia> listaMateria = new ArrayList<Materia>();

        Materia mat1 = new Materia();
        Materia mat2 = new Materia();
        Materia mat3 = new Materia();
        Materia mat4 = new Materia();

        mat1.setCodigo("MAT115");
        mat2.setCodigo("PSI115");
        mat3.setCodigo("MTE115");
        mat4.setCodigo("IAI115");

        Materia mat5 = new Materia("PRN115", mat4);
        Materia mat6 = new Materia("MSM115", mat4);
        Materia mat7 = new Materia("HSE115", mat2);
        Materia mat8 = new Materia("MAT215", mat1);
        Materia mat9 = new Materia("FIR115", mat1);

        listaMateria.add(mat1);
        listaMateria.add(mat2);
        listaMateria.add(mat3);
        listaMateria.add(mat4);
        listaMateria.add(mat5);
        listaMateria.add(mat6);
        listaMateria.add(mat7);
        listaMateria.add(mat8);
        listaMateria.add(mat9);

        imprimirElementos(listaMateria);
    }

    private static void imprimirElementos(List<Materia> arreglo) {
        for (Materia materia : arreglo) {
            System.out.print(materia.toString());
        }
    }
}