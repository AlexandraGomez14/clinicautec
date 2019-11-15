package com.clinica.modelo;

public class Municipio {
    private String codMunicipio;
    private String nombre;
    private String codDepartamento;

    public Municipio() {
    }

    public Municipio(String codMunicipio, String nombre, String codDepartamento) {
        this.codMunicipio = codMunicipio;
        this.nombre = nombre;
        this.codDepartamento = codDepartamento;
    }

    public String getCodMunicipio() {
        return codMunicipio;
    }

    public void setCodMunicipio(String codMunicipio) {
        this.codMunicipio = codMunicipio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }
    
}
