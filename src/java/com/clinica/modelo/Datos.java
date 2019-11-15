package com.clinica.modelo;

public class Datos {
   private String codPaciente;
   private String primerNombre;
   private String primerApellido;
   private String doctor;
   private String fechaCita;

    public Datos() {
    }

    public Datos(String codPaciente, String primerNombre, String primerApellido, String doctor, String fechaCita) {
        this.codPaciente = codPaciente;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.doctor = doctor;
        this.fechaCita = fechaCita;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }
   
}
