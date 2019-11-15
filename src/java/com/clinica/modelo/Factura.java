package com.clinica.modelo;


public class Factura {
    private String codFactura;
    private String codPaciente;
    private double descuento;
    private double total;
    private String codTipoPago;
    private String codConsulta;

    public Factura() {
    }

    public Factura(String codFactura, String codPaciente, double descuento, double total, String codTipoPago, String codConsulta) {
        this.codFactura = codFactura;
        this.codPaciente = codPaciente;
        this.descuento = descuento;
        this.total = total;
        this.codTipoPago = codTipoPago;
        this.codConsulta = codConsulta;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getCodTipoPago() {
        return codTipoPago;
    }

    public void setCodTipoPago(String codTipoPago) {
        this.codTipoPago = codTipoPago;
    }

    public String getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(String codConsulta) {
        this.codConsulta = codConsulta;
    }
    
    
}
