package com.cafeto.mockingexample;

public class Reporte {

	private String titulo;
	private String informacion;
	
	public Reporte(String title, String info) {
		titulo = title;
		informacion = info;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getInformacion() {
		return informacion;
	}

	public void setInformacion(String informacion) {
		this.informacion = informacion;
	}
}
