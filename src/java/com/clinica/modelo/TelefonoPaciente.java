package com.clinica.modelo;

public class TelefonoPaciente {
    private String codPaciente;
    private String telCasa;
    private String telPersonal;
    private String telAuxiliar;

    public TelefonoPaciente() {
    }

    public TelefonoPaciente(String codPaciente, String telCasa, String telPersonal, String telAuxiliar) {
        this.codPaciente = codPaciente;
        this.telCasa = telCasa;
        this.telPersonal = telPersonal;
        this.telAuxiliar = telAuxiliar;
    }

    public String getCodPaciente() {
        return codPaciente;
    }

    public void setCodPaciente(String codPaciente) {
        this.codPaciente = codPaciente;
    }

    public String getTelCasa() {
        return telCasa;
    }

    public void setTelCasa(String telCasa) {
        this.telCasa = telCasa;
    }

    public String getTelPersonal() {
        return telPersonal;
    }

    public void setTelPersonal(String telPersonal) {
        this.telPersonal = telPersonal;
    }

    public String getTelAuxiliar() {
        return telAuxiliar;
    }

    public void setTelAuxiliar(String telAuxiliar) {
        this.telAuxiliar = telAuxiliar;
    }
}
