package servicioCliente;
//@michi y gaby 

import java.util.List;
import modeloCliente.Producto;

public interface IProductoServicio {
    public Producto crear(Producto producto);
    public List<Producto> listar();
    public Producto eliminar(int codigoProducto);
    public Producto modificar(int codigoProducto, Producto productoNueva);
    public int buscarposicion(Producto producto);
    public Producto buscarPorCodigo(int codigoProducto); 
}
