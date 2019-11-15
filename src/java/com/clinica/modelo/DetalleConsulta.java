package com.clinica.modelo;

public class DetalleConsulta {
    private String codCosulta;
    private String[] codServicio;

    public DetalleConsulta() {
    }

    public DetalleConsulta(String codCosulta, String[] codServicio) {
        this.codCosulta = codCosulta;
        this.codServicio = codServicio;
    }

    public String getCodCosulta() {
        return codCosulta;
    }

    public void setCodCosulta(String codCosulta) {
        this.codCosulta = codCosulta;
    }

    public String[] getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String[] codServicio) {
        this.codServicio = codServicio;
    }
}
