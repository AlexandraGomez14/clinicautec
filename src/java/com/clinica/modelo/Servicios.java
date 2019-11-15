package com.clinica.modelo;

public class Servicios {
    private String codServicio;
    private String nombreServicio;
    private double precio;
    private double costo;

    public Servicios() {
    }

    public Servicios(String codServicio, String nombreServicio, double precio, double costo) {
        this.codServicio = codServicio;
        this.nombreServicio = nombreServicio;
        this.precio = precio;
        this.costo = costo;
    }

    public String getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String codServicio) {
        this.codServicio = codServicio;
    }

    public String getNombreServicio() {
        return nombreServicio;
    }

    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
    
    
}
