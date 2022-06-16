package modeloCliente;
//@michi

public class Factura {
    
    private int codigo;
    private String nombre;
    private String direccion;
    private Cliente cliente;
    private Producto producto;

    public Factura(int codigo, String nombre, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Factura(int codigo, String nombre, String direccion, Cliente cliente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.direccion = direccion;
        this.cliente = cliente;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Factura{" + "codigo=" + codigo + ", nombre=" + nombre + 
                ", direccion=" + direccion + ", cliente=" + cliente.toString() + '}';
    }


    
}
