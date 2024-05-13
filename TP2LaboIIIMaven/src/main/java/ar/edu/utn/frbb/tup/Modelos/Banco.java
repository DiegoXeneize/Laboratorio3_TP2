package ar.edu.utn.frbb.tup.Modelos;

import java.util.ArrayList;
import java.util.List;


public class Banco {

    private ArrayList<Cliente> clientes = new ArrayList<>();


    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public void agregarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }
    
    
}
