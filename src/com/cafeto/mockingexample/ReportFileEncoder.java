package com.cafeto.mockingexample;

import java.io.File;


public class ReportFileEncoder implements IReportFileEncoder {

	@Override
	public File generarReporteXML(Report report) {
		return new File(report.getTitulo());
	}

	@Override
	public File generarReporteExcel(Report report) {
		return new File(report.getTitulo());
	}

	@Override
	public File generarReporteJson(Report report) {
		return new File(report.getTitulo());
	}

}
