package controladorCliente;
//@michi y gaby

import java.time.LocalDate;
import java.util.List;
import modeloCliente.Producto;
import servicioCliente.ProductoServicio;

public class ProductoControl {
    private final ProductoServicio facturaServicio = new ProductoServicio();
    
    public Producto crear(String [] args){
        var producto= new Producto(Integer.valueOf(args[0]),args[1],args[2]);
        this.facturaServicio.crear(producto);
        return producto;
    }
    
    public List<Producto> listar(){
        return this.facturaServicio.listar();
    }
}