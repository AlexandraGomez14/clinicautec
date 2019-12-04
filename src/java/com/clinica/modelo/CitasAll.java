package com.clinica.modelo;

public class CitasAll {

    private String codCita;
    private String estado;
    private String fechaCita;
    private String fechaActual;
    private String hora;
    private String consultorio;
    private String codDoctor;
    private String codPaciente;

    /*inner join*/
    private String primerNombreDoctor;
    private String primerApellidoDoctor;
    private String primerNombrePaciente;
    private String primerApellidoPaciente;

    public CitasAll() {
    }

    public CitasAll(String codCita, String estado, String fechaCita, String fechaActual, String hora, String consultorio, String codDoctor, String codPaciente, String primerNombreDoctor, String primerApellidoDoctor, String primerNombrePaciente, String primerApellidoPaciente) {
        this.codCita = codCita;
        this.estado = estado;
        this.fechaCita = fechaCita;
        this.fechaActual = fechaActual;
        this.hora = hora;
        this.consultorio = consultorio;
        this.codDoctor = codDoctor;
        this.codPaciente = codPaciente;
        this.primerNombreDoctor = primerNombreDoctor;
        this.primerApellidoDoctor = primerApellidoDoctor;
        this.primerNombrePaciente = primerNombrePaciente;
        this.primerApellidoPaciente = primerApellidoPaciente;
    }

    public String getCodCita() {
        return codCita;
    }

    public void setCodCita(String codCita) {
        this.codCita = codCita;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getFechaActual() {
        return fechaActual;
    }

    public void setFechaActual(String fechaActual) {
        this.fechaActual = fechaActual;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getConsultorio() {
        return consultorio;
    }

    public void setConsultorio(String consultorio) {
        this.consultorio = consultorio;
    }

    public String getCodDoctor() {
        return codDoctor;
    }

    public void setCodDoctor(String codDoctor) {
        this.codDoctor = codDoctor;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getPrimerNombreDoctor() {
        return primerNombreDoctor;
    }

    public void setPrimerNombreDoctor(String primerNombreDoctor) {
        this.primerNombreDoctor = primerNombreDoctor;
    }

    public String getPrimerApellidoDoctor() {
        return primerApellidoDoctor;
    }

    public void setPrimerApellidoDoctor(String primerApellidoDoctor) {
        this.primerApellidoDoctor = primerApellidoDoctor;
    }

    public String getPrimerNombrePaciente() {
        return primerNombrePaciente;
    }

    public void setPrimerNombrePaciente(String primerNombrePaciente) {
        this.primerNombrePaciente = primerNombrePaciente;
    }

    public String getPrimerApellidoPaciente() {
        return primerApellidoPaciente;
    }

    public void setPrimerApellidoPaciente(String primerApellidoPaciente) {
        this.primerApellidoPaciente = primerApellidoPaciente;
    }
    
    
}
