package com.cafeto.mockingexample;

import java.io.File;

public interface IReportFileEncoder {

	public File generarReporteXML(Report report);
	public File generarReporteExcel(Report report);
	public File generarReporteJson(Report report);
}
