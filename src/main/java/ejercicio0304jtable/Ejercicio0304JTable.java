
package ejercicio0304jtable;

import vistaCliente.VistaCliente;
import vistaCliente.VistaFactura;
import vistaCliente.VistaProducto;
import vistaCliente.UpdateFactura;
import vistaCliente.DeleteFactura;
        
public class Ejercicio0304JTable {


    public static void main(String[] args) {
        
        var v1 = new VistaCliente();
        v1.setVisible(true);
        var v2 = new VistaProducto();
        v2.setVisible(true);
        var v3 = new VistaFactura();
        v3.setVisible(true);
        var v4 = new UpdateFactura();
        v4.setVisible(true);
        var v5 = new DeleteFactura();
        v5.setVisible(true);

    }
}
