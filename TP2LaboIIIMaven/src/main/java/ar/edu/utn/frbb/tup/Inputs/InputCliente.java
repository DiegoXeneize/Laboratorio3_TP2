package ar.edu.utn.frbb.tup.Inputs;

import ar.edu.utn.frbb.tup.Modelos.Cliente;
import ar.edu.utn.frbb.tup.Modelos.Banco;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class InputCliente {

    Scanner scanner = new Scanner(System.in);

    public void agregarCliente(Banco banco) {
        char respuesta;
    
        do {
            System.out.println("Ingrese el DNI del cliente:");
            String dni = scanner.nextLine();
    
            System.out.println("Ingrese el nombre del cliente:");
            String nombre = scanner.nextLine();
    
            System.out.println("Ingrese el apellido del cliente:");
            String apellido = scanner.nextLine();
    
            System.out.println("Ingrese la dirección del cliente:");
            String direccion = scanner.nextLine();
    
            System.out.println("Ingrese el número de teléfono del cliente:");
            String numTelefono = scanner.nextLine();
    
            Cliente nuevoCliente = new Cliente(dni, nombre, apellido, direccion, numTelefono);
            banco.agregarCliente(nuevoCliente);
            
            // Imprimir los detalles del cliente
            System.out.println("Cliente agregado correctamente:");
            System.out.println(nuevoCliente);
    
            do {
                System.out.println("¿Desea agregar otro cliente?");
                respuesta = Character.toUpperCase(scanner.next().charAt(0));
            } while (respuesta != 'S' && respuesta != 'N');
        
            scanner.nextLine();
            
        } while (respuesta == 'S');
    }


    

}
