/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab01ejem01;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author kenetcode
 */
public class Factura extends Comprobante {
    
    private float total;
    private Cliente cliente;
    private ArrayList<Producto> producto;
    
    
    public Factura(char p_tipo, int p_numero, Fecha p_fecha, Cliente p_cliente){
        
        super(p_tipo, p_numero, p_fecha);
        
        setCliente(p_cliente);
        
        producto = new ArrayList<Producto>();
        
    }
    
    public void AgregarProducto(Producto p_producto){
        producto.add(p_producto);
        setTotal(getTotal() + p_producto.getPrecio());
    }
    
    public void MostrarProductos(){
        Iterator <Producto> productoIter = producto.iterator();
        while(productoIter.hasNext()){
            Producto elemento = productoIter.next();
            System.out.printf("Codigo: %d Descripcion: %s Precio $%5.2f \n", 
                    elemento.getCodigo(), elemento.getDescripcion(), elemento.getPrecio());
        }
    }
    
    public void MostrarFactura(){
        System.out.printf("Tipo: %c - Numero: %d - Fecha: %d/%d/%d\n", 
                getTipo(), getNumero(), getFecha().getDia(),
                getFecha().getMes(), getFecha().getAnio());
        System.out.printf("\nCliente: \n");
        System.out.printf("Codigo: %d - Razon Social: %s \n", 
                cliente.getCodigo(), cliente.getRazonSocial());
        System.out.println("\nProductos: \n");
        MostrarProductos();
        System.out.printf("Total: %6.2f\n", getTotal());
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<Producto> getProducto() {
        return producto;
    }

    public void setProducto(ArrayList<Producto> producto) {
        this.producto = producto;
    }

}
