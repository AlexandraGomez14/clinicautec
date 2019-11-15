package com.clinica.modelo;

public class Departamento {
   private String codDepartamento;
   private String nombre;

    public Departamento() {
    }

    public Departamento(String codDepartamento, String nombre) {
        this.codDepartamento = codDepartamento;
        this.nombre = nombre;
    }

    public String getCodDepartamento() {
        return codDepartamento;
    }

    public void setCodDepartamento(String codDepartamento) {
        this.codDepartamento = codDepartamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
}
