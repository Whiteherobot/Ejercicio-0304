package modeloCliente;
//@michi y gaby
public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private Factura factura;
    private Producto producto;

    public Cliente(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Cliente(int codigo, String nombre, String apellido, Factura factura, Producto producto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.factura = factura;
        this.producto = producto;
    }
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    

    @Override
    public String toString() {
        return "Cliente{" + "codigo=" + codigo + 
                ", nombre=" + nombre + ", apellido=" + apellido + '}';
    }

    
}
