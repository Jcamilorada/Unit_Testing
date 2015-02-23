package com.cafeto.mockingexample;

import lombok.Getter;
import lombok.Setter;

import java.io.File;

import static com.google.common.base.Preconditions.checkNotNull;

public class ReportGenerator {
	
	@Getter @Setter private Report reporte;
	private IReportFileEncoder codificador;
	
	public ReportGenerator(IReportFileEncoder codificador) {
		this.codificador = checkNotNull(codificador);
	}

	private void guardarArchivo(File archivo) {
		checkNotNull(archivo);
	}
	
	public void guardarExcel(Report reporte) {
        checkNotNull(reporte);
		guardarArchivo(codificador.generarReporteExcel(reporte));
	}
	
	public void guardarJson(Report reporte) {
        checkNotNull(reporte);
		guardarArchivo(codificador.generarReporteJson(reporte));
	}
	
	public void guardarXML(Report reporte) {
        checkNotNull(reporte);
		guardarArchivo(codificador.generarReporteXML(reporte));
	}

}
