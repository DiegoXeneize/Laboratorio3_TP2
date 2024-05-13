package ar.edu.utn.frbb.tup.Inputs;

import java.util.Scanner;
import java.util.ResourceBundle.Control;

import ar.edu.utn.frbb.tup.Modelos.Banco;
import ar.edu.utn.frbb.tup.Utils.Funciones;
import ar.edu.utn.frbb.tup.Utils.FuncionesCliente;
import ar.edu.utn.frbb.tup.Utils.FuncionesCuenta;
import ar.edu.utn.frbb.tup.Interfaces.MenuInterface;
import ar.edu.utn.frbb.tup.Control.ControlCuentas;


public class MenuIngreso {

    Scanner scanner = new Scanner(System.in);
    
    InputCliente inputCliente = new InputCliente();
    InputCuenta inputCuenta = new InputCuenta();
    FuncionesCliente funcionesCliente = new FuncionesCliente();
    FuncionesCuenta funcionesCuenta = new FuncionesCuenta();


    public void ingresarDatos(Banco banco, ControlCuentas controlCuentas) {
        int opcion;

        do {
            MenuInterface.inputMenu();
            opcion = scanner.nextInt();

            switch (opcion) {
                case (1):
                    inputCliente.agregarCliente(banco);
                    break;
                case (2):
                    funcionesCliente.imprimirClientes(banco);
                    break;
                case (3):
                    inputCuenta.agregarCuenta(controlCuentas, banco);
                    break;
                case (4):
                    funcionesCuenta.imprimirCuentas(controlCuentas);
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
