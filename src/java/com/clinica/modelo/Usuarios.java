package com.clinica.modelo;

import java.io.Serializable;

public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String contra;
	private int codigoRol;

	public Usuarios() {
		super();
	}
	
	public Usuarios(String usuario, String contra, int codigoRol) {
		super();
		this.usuario = usuario;
		this.contra = contra;
		this.codigoRol = codigoRol;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	public int getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(int codigoRol) {
		this.codigoRol = codigoRol;
	}
}
