package servicioCliente;
//@michi y gaby

import java.util.List;
import modeloCliente.Cliente;

public interface IClienteServicio {
  public Cliente crear( Cliente cliente);
  public List<Cliente> listar();
  public Cliente eliminar(int codigoCliente);
  public Cliente modificar(int codigoCliente, Cliente clienteNuevo);
  public int buscarposicion(Cliente cliente);
  public Cliente buscarPorCodigo(int codigoCliente); 
}  
