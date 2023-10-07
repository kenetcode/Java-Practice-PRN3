/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package op20001lab06ejem01;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author kenetcode
 */
public class ProductoTableModel extends AbstractTableModel {

    List<Producto> productos = new ArrayList<Producto>();

    @Override
    public int getRowCount() {
        return productos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        Producto producto = productos.get(rowIndex);
        
        Object valor = null;
        
        switch (columnIndex) {
            case 0:
                valor = producto.codigo;
                break;
            case 1:
                valor = producto.nombre;
                break;
            case 2:
                valor = producto.cantidadExistencia;
                break;
            case 3:
                valor = producto.precioUnitario;
                break;
        }
        return valor;
    }

}
