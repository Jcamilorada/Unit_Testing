package com.cafeto.mockingexample;

import java.io.File;

/**
 * Implementation of the interface IReportFileEncoder.
 */
public class ReportFileEncoder implements IReportFileEncoder
{
    @Override
    public File generateReportXML(Report report) {
        return new File(report.getTitle());
    }
    
    @Override
    public File generateReportExcel(Report report) {
        return new File(report.getTitle());
    }
    
    @Override
    public File generateReportJson(Report report) {
        return new File(report.getTitle());
    }
}
