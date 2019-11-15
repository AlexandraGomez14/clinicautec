package com.clinica.modelo;

public class Consulta {
    private String codConsulta;
    private String codPaciente;
    private String fechaConsulta;
    private String fechaInicioServicio;
    private String fechaFinServicio;
    private String hora;
    private String Observacion;
    private String codDoctor;

    public Consulta() {
    }

    public Consulta(String codConsulta, String codPaciente, String fechaConsulta, String fechaInicioServicio, String fechaFinServicio, String hora, String Observacion, String codDoctor) {
        this.codConsulta = codConsulta;
        this.codPaciente = codPaciente;
        this.fechaConsulta = fechaConsulta;
        this.fechaInicioServicio = fechaInicioServicio;
        this.fechaFinServicio = fechaFinServicio;
        this.hora = hora;
        this.Observacion = Observacion;
        this.codDoctor = codDoctor;
    }

    public String getCodConsulta() {
        return codConsulta;
    }

    public void setCodConsulta(String codConsulta) {
        this.codConsulta = codConsulta;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(String fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getFechaInicioServicio() {
        return fechaInicioServicio;
    }

    public void setFechaInicioServicio(String fechaInicioServicio) {
        this.fechaInicioServicio = fechaInicioServicio;
    }

    public String getFechaFinServicio() {
        return fechaFinServicio;
    }

    public void setFechaFinServicio(String fechaFinServicio) {
        this.fechaFinServicio = fechaFinServicio;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return Observacion;
    }

    public void setObservacion(String Observacion) {
        this.Observacion = Observacion;
    }

    public String getCodDoctor() {
        return codDoctor;
    }

    public void setCodDoctor(String codDoctor) {
        this.codDoctor = codDoctor;
    }
    
}
