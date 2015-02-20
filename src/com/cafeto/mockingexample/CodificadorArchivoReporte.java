package com.cafeto.mockingexample;

import java.io.File;

public interface CodificadorArchivoReporte {

	public File generarReporteXML(Reporte report);
	public File generarReporteExcel(Reporte report);
	public File generarReporteJson(Reporte report);
}
