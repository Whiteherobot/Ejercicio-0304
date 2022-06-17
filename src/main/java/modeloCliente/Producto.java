package modeloCliente;
//@michi



public class Producto {
   private int costoProducto;
   private String direccionEnvio;
   private String nombreProducto;
   private Factura factura;
   private Cliente cliente;

    public Producto(int costoProducto, String direccionEnvio, String nombreProducto) {
        this.costoProducto = costoProducto;
        this.direccionEnvio = direccionEnvio;
        this.nombreProducto = nombreProducto;
    }

    public Producto(int costoProducto, String direccionEnvio, String nombreProducto, Factura factura, Cliente cliente) {
        this.costoProducto = costoProducto;
        this.direccionEnvio = direccionEnvio;
        this.nombreProducto = nombreProducto;
        this.factura = factura;
        this.cliente = cliente;
    }
    

    public int getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    public String getDireccionEnvio() {
        return direccionEnvio;
    }

    public void setDireccionEnvio(String direccionEnvio) {
        this.direccionEnvio = direccionEnvio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    

    @Override
    public String toString() {
        return "Producto{" + "costoProducto=" + costoProducto + 
                ", direccionEnvio=" + direccionEnvio + ", nombreProducto=" + 
                nombreProducto + '}';
    }

   
}
