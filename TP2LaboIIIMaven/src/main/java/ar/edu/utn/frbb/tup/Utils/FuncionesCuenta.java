package ar.edu.utn.frbb.tup.Utils;

import ar.edu.utn.frbb.tup.Control.ControlCuentas;
import ar.edu.utn.frbb.tup.Inputs.InputCuenta;
import ar.edu.utn.frbb.tup.Modelos.Banco;
import ar.edu.utn.frbb.tup.Modelos.Cliente;
import ar.edu.utn.frbb.tup.Modelos.CuentaBancaria;

public class FuncionesCuenta {

    public void imprimirCuentas(ControlCuentas control) {

        if (control.getCuentas().isEmpty()) {
            System.out.println("No hay cuentas para imprimir.");
        } else {
            for (CuentaBancaria cuenta : control.getCuentas()) {
                System.out.println(cuenta.toString());
            }
        }
    }
}
