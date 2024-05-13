package ar.edu.utn.frbb.tup.Modelos;

import ar.edu.utn.frbb.tup.Enums.TipoCuenta;

import java.time.LocalDate;

public class CuentaBancaria {

    private String numCuenta;
    private Cliente clienteAsociado;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private LocalDate fechaApertura;

    public CuentaBancaria(String numCuenta, Cliente clienteAsociado, TipoCuenta tipoCuenta, double saldo, LocalDate fechaApertura){
        this.numCuenta = numCuenta;
        this.clienteAsociado = clienteAsociado;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
        this.fechaApertura = fechaApertura;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "numCuenta='" + numCuenta + '\'' +
                ", clienteAsociado=" + clienteAsociado +
                ", tipoCuenta=" + tipoCuenta +
                ", saldo=" + saldo +
                ", fechaApertura=" + fechaApertura +
                '}';
    }
    
}
