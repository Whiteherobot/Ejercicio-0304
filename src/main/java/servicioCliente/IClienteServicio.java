package servicioCliente;
//@michi y gaby

import java.util.List;
import modeloCliente.Cliente;

public interface IClienteServicio {
  public Cliente crear( Cliente cliente);
  public Cliente buscarPorCodigo(int codigoCliente);
  public List<Cliente> listar();
}  
