package servicioCliente;
//@michi y gaby

import java.util.ArrayList;
import java.util.List;
import modeloCliente.Factura;

public class FacturaServicio implements IFacturaServicio{
    private static List<Factura> facturaList = new ArrayList<>();

    @Override
    public Factura crear(Factura factura) {
        this.facturaList.add(factura);
        return factura;
    }

    @Override
    public Factura modificar(int codigoFactura, Factura facturaNuevo) {
        var posicion = this.buscarposicion(this.buscarPorCodigo(codigoFactura));
        this.listar().get(posicion).setCodigo(facturaNuevo.getCodigo());
        this.listar().get(posicion).setNombre(facturaNuevo.getNombre());
        this.listar().get(posicion).setDireccion(facturaNuevo.getDireccion());
        return facturaNuevo;
    }

    @Override
    public Factura eliminar(int codigoFactura) {
        Factura factura = this.buscarPorCodigo(codigoFactura);
        var posicion=this.buscarPorCodigo(codigoFactura);
        this.listar().remove(posicion);
        return factura;
    }

    @Override
    public Factura buscarPorCodigo(int codigoFactura) {
        Factura factura=null;
        for(var f:this.facturaList){
            if(codigoFactura==f.getCodigo()){
                factura=f;
                break;
            }
        }
        return factura;
    }

    @Override
    public int buscarposicion(Factura factura) {
    int posicion=-1;
        for(var f:this.facturaList){
            posicion++;
            if(f.getCodigo()==factura.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    @Override
    public List<Factura> listar() {
        return this.facturaList;
    }
    
}
