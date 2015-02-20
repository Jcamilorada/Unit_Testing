package com.cafeto.mockingexample;

import java.io.File;

public class GeneradorReporte {
	
	private Reporte reporte;
	private CodificadorArchivoReporte codificador;
	
	public GeneradorReporte(CodificadorArchivoReporte codificador) {
		this.codificador = codificador;
	}

	public Reporte getReporte() {
		return reporte;
	}

	public void setReporte(Reporte reporte) {
		this.reporte = reporte;
	}
	
	private void guardarArchivo(File archivo) {
		// save the file
	}
	
	public void guardarExcel(Reporte reporte) {
		guardarArchivo(codificador.generarReporteExcel(reporte));
	}
	
	public void guardarJson(Reporte reporte) {
		guardarArchivo(codificador.generarReporteJson(reporte));
	}
	
	public void guardarXML(Reporte reporte) {
		guardarArchivo(codificador.generarReporteXML(reporte));
	}

}
