package ar.edu.utn.frbb.tup.Inputs;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import ar.edu.utn.frbb.tup.Modelos.Banco;
import ar.edu.utn.frbb.tup.Modelos.Cliente;
import ar.edu.utn.frbb.tup.Modelos.CuentaBancaria;
import ar.edu.utn.frbb.tup.Utils.Funciones;
import ar.edu.utn.frbb.tup.Utils.FuncionesCliente;

public class InputCuenta {

    Scanner scanner = new Scanner(System.in);

    private List<CuentaBancaria> cuentas;
    FuncionesCliente funciones = new FuncionesCliente();


    public InputCuenta() {

        cuentas = new ArrayList<>();
    }

    public void agregarCuenta(Banco banco) {

        char respuesta;
        boolean validarFecha = false;
        LocalDate fechaAperturaLocalDate = null;

        do {

            System.out.println("Numero de cuenta:");
            String numCuenta = scanner.nextLine();

            System.out.println("Tipo de cuenta (Ahorro o Corriente):");
            String tipoCuentaInput = scanner.nextLine().toLowerCase();

            CuentaBancaria.TipoCuenta tipoCuenta = null;
            if (tipoCuentaInput.equals("ahorro")) {
                tipoCuenta = CuentaBancaria.TipoCuenta.AHORRO;
            } else if (tipoCuentaInput.equals("corriente")) {
                tipoCuenta = CuentaBancaria.TipoCuenta.CORRIENTE;
            } else {
                System.out.println("Tipo de cuenta inválida");
            }

            System.out.println("Saldo inicial:");
            double saldo = scanner.nextDouble();

            scanner.nextLine();

        do {
            System.out.println("Fecha de apertura (dd-mm-aaaa):");
            String fechaApertura = scanner.nextLine();
            
            //preguntar mejor manera de hacerlo al profesor (probado por chat gpt)
            try {
                fechaAperturaLocalDate = LocalDate.parse(fechaApertura, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
                validarFecha = true;
            } catch (DateTimeParseException e) {
                System.out.println("Error: La fecha proporcionada no tiene el formato correcto (dd/mm/aaaa)");
            }
        } while (!validarFecha);
        

        System.out.println("Ingrese el DNI del cliente asociado:");
        String dniCliente = scanner.nextLine();
        Cliente clienteAsociado = funciones.buscarClientePorDni(dniCliente,banco);

        if (clienteAsociado == null) {
            System.out.println("Cliente no encontrado");
        }else {
            CuentaBancaria nuevaCuenta = new CuentaBancaria(numCuenta, clienteAsociado, tipoCuenta, saldo, fechaAperturaLocalDate);
            cuentas.add(nuevaCuenta);
            
        }

        do {
            System.out.println("¿Desea asignar otra cuenta?");
            respuesta = Character.toUpperCase(scanner.next().charAt(0));
        } while (respuesta != 'S' && respuesta != 'N');

        scanner.nextLine();
        
    } while (respuesta == 'S');
        
    }
    
}
