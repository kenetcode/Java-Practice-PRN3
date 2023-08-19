/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package op20001lab01ejem01;

/**
 *
 * @author kenetcode
 */
public class OP20001Lab01Ejem01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Fecha fecha = new Fecha(15, 5, 2017);
        Producto producto1 = new Producto(6098, "Laptop", 900);
        Producto producto2 = new Producto(2178, "Silla ergonomica", 300);
        Cliente cliente = new Cliente(1028, "Servicios tecnologicos");
        Factura factura = new Factura('1', 1002, fecha, cliente);
        factura.AgregarProducto(producto1);
        factura.AgregarProducto(producto2);
        factura.MostrarFactura();
    }
    
}
