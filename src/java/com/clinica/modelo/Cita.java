package com.clinica.modelo;

import java.util.Date;

public class Cita {
    private String codCita;
    private String estado;
    private String fechaCita;
    private String fechaActual;
    private String hora;
    private String consultorio;
    private String codDoctor;
    private String codPaciente;
    
    public Cita() {
    }

    public Cita(String codCita, String estado, String fechaCita, String fechaActual, String hora, String consultorio, String codDoctor, String codPaciente) {
        this.codCita = codCita;
        this.estado = estado;
        this.fechaCita = fechaCita;
        this.fechaActual = fechaActual;
        this.hora = hora;
        this.consultorio = consultorio;
        this.codDoctor = codDoctor;
        this.codPaciente = codPaciente;
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

   
}
