package com.clinica.modelo;

public class DireccionPaciente {
    private String codDireccion;
    private String colonia;
    private String pasaje;
    private String numCasa;
    private String codDepartamento;
    private String codPaciente;

    public DireccionPaciente() {
    }

    public DireccionPaciente(String codDireccion, String colonia, String pasaje, String numCasa, String codDepartamento, String codPaciente) {
        this.codDireccion = codDireccion;
        this.colonia = colonia;
        this.pasaje = pasaje;
        this.numCasa = numCasa;
        this.codDepartamento = codDepartamento;
        this.codPaciente = codPaciente;
    }

    public String getCodDireccion() {
        return codDireccion;
    }

    public void setCodDireccion(String codDireccion) {
        this.codDireccion = codDireccion;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getPasaje() {
        return pasaje;
    }

    public void setPasaje(String pasaje) {
        this.pasaje = pasaje;
    }

    public String getNumCasa() {
        return numCasa;
    }

    public void setNumCasa(String numCasa) {
        this.numCasa = numCasa;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }
    
    
}
