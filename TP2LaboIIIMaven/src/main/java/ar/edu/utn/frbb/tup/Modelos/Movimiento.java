package ar.edu.utn.frbb.tup.Modelos;

import java.time.LocalDate;
import java.time.LocalTime;

import ar.edu.utn.frbb.tup.Enums.TipoOperacion;

public class Movimiento {
    private LocalDate fechaMovimiento;
    private LocalTime horaMovimiento;
    private TipoOperacion tipoOperacion;
    private double monto;

    public Movimiento(LocalDate fechaMovimiento, LocalTime horaMovimiento, TipoOperacion tipoOperacion, double monto) {
        this.fechaMovimiento = fechaMovimiento;
        this.horaMovimiento = horaMovimiento;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
    }

    public LocalDate getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(LocalDate fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public LocalTime getHoraMovimiento() {
        return horaMovimiento;
    }

    public void setHoraMovimiento(LocalTime horaMovimiento) {
        this.horaMovimiento = horaMovimiento;
    }

    public TipoOperacion getTipoOperacion() {
        return tipoOperacion;
    }

    public void setTipoOperacion(TipoOperacion tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    


}
