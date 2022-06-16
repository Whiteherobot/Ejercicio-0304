package modeloCliente;
//@michi

import java.time.LocalDate;

public class Producto {
   private int costoProducto;
   private String direccionEnvio;
   private String nombreProducto;

    public Producto(int costoProducto, String direccionEnvio, String nombreProducto) {
        this.costoProducto = costoProducto;
        this.direccionEnvio = direccionEnvio;
        this.nombreProducto = nombreProducto;
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

    @Override
    public String toString() {
        return "Producto{" + "costoProducto=" + costoProducto + 
                ", direccionEnvio=" + direccionEnvio + ", nombreProducto=" + 
                nombreProducto + '}';
    }

   
}
