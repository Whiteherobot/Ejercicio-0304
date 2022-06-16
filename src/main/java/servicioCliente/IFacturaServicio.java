package servicioCliente;
//@michi y gaby

import java.util.List;
import modeloCliente.Factura;

public interface IFacturaServicio {
    public Factura crear( Factura factura);
    public List<Factura> listar();
    public Factura eliminar(int codigoFactura);
    public Factura modificar(int codigoFactura, Factura facturaNueva);
    public int buscarposicion(Factura factura);
    public Factura buscarPorCodigo(int codigoFactura);
}
