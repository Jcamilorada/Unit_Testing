package com.cafeto.mockingexample;

import java.io.File;

public class CodificadorArchivoReporteImpl implements CodificadorArchivoReporte {

	@Override
	public File generarReporteXML(Reporte report) {
		return new File(report.getTitulo());
	}

	@Override
	public File generarReporteExcel(Reporte report) {
		return new File(report.getTitulo());
	}

	@Override
	public File generarReporteJson(Reporte report) {
		return new File(report.getTitulo());
	}

}
