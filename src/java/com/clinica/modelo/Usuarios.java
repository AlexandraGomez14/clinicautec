package com.clinica.modelo;

import java.io.Serializable;

public class Usuarios implements Serializable{

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String contra;
	private String codigoRol;

	public Usuarios() {
		super();
	}
	
	public Usuarios(String usuario, String contra, String codigoRol) {
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
	public String getCodigoRol() {
		return codigoRol;
	}
	public void setCodigoRol(String codigoRol) {
		this.codigoRol = codigoRol;
	}
}
