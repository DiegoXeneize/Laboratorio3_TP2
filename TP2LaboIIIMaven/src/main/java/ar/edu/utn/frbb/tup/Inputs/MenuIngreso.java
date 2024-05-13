package ar.edu.utn.frbb.tup.Inputs;

import java.util.Scanner;

import ar.edu.utn.frbb.tup.Modelos.Banco;
import ar.edu.utn.frbb.tup.Utils.Funciones;
import ar.edu.utn.frbb.tup.Utils.FuncionesCliente;
import ar.edu.utn.frbb.tup.Interfaces.MenuInterface;


public class MenuIngreso {

    Scanner scanner = new Scanner(System.in);
    
    InputCliente inputCliente = new InputCliente();
    InputCuenta inputCuenta = new InputCuenta();
    FuncionesCliente funciones = new FuncionesCliente();


    public void ingresarDatos(Banco banco) {
        int opcion;

        do {
            MenuInterface.inputMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case (1):
                    inputCliente.agregarCliente(banco);
                    break;
                case (2):
                    inputCuenta.agregarCuenta(banco);
                    break;
                case (3):
                    funciones.imprimirClientes(banco);
                    break;
                case (4):
                    System.out.println("Lista de cuentas:");
                    break;
                case (5):
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("No es una opcion valida");
                    break;
            }

        } while (opcion != 5);
    }
}
