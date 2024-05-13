package ar.edu.utn.frbb.tup.Utils;
import ar.edu.utn.frbb.tup.Modelos.Banco;
import ar.edu.utn.frbb.tup.Modelos.Cliente;

public class FuncionesCliente {

    public Cliente buscarClientePorDni(String dni, Banco banco) {
  
        Cliente cliente = null;

        for (Cliente clienteBuscado : banco.getClientes()) {
            if (clienteBuscado.getDni().equals(dni)) {
                cliente = clienteBuscado;
                break;
            }
        }

        if (cliente != null) {
            System.out.println("Cliente encontrado");
        } else {
            System.out.println("Cliente no encontrado");
        }

        return cliente;
    }


    public void imprimirClientes(Banco banco) {

        if (banco.getClientes().isEmpty()) {
            System.out.println("No hay clientes para imprimir.");
        } else {
            for (Cliente cliente : banco.getClientes()) {
                System.out.println(cliente.toString());
            }
        }
    }

    public void eliminarCliente(Banco banco, String dni) {
        for (Cliente cliente : banco.getClientes()) {
            if(cliente.getDni().equals(dni)){
                banco.getClientes().remove(cliente);
                System.out.println("Cliente eliminado");
            }else{
                System.out.println("Cliente no encontrado");
            }
        }
    }

}
