package ar.edu.utn.frbb.tup.Control;

import java.util.ArrayList;

import ar.edu.utn.frbb.tup.Modelos.CuentaBancaria;

public class ControlCuentas {
    private ArrayList<CuentaBancaria> cuentas = new ArrayList<>();


    public ArrayList<CuentaBancaria> getCuentas() {
        return cuentas;
    }

    public void setCuentas(ArrayList<CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void agregarCuenta(CuentaBancaria cuenta) {
        this.cuentas.add(cuenta);
    }

    

}
