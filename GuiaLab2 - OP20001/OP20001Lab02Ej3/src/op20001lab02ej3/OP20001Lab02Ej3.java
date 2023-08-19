/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op20001lab02ej3;

/**
 *
 * @author kenetcode
 */
public class OP20001Lab02Ej3 {

    /**s
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Debido a la multiplicidad 1..* Hecha por 1, enter Pieza y Fabricante, el
        constructor de pieza siempre debe incluir un objeto de tipo Fabricante.*/
        Fabricante fab1 =new Fabricante("Toyota");

        //prueba 1        
        Pieza pieza1 = new Pieza(100, fab1);        
        pieza1.comprar(20);
        pieza1.comprar(20);
        
        System.out.println(pieza1);
        
        //prueba 2
        Pieza pieza2 = new Pieza(100, fab1);
        pieza2.comprar(20);
        pieza2.comprar(20);
        pieza2.vender(30);
        
        System.out.println(pieza2); 
    }
    
}
