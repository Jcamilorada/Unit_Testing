package com.cafeto.mockingexample;

import static com.google.common.base.Preconditions.checkNotNull;
import java.io.File;

/**
 * Class for generating and saving reports.
 */
public class ReportGenerator
{
    private Report report;
    private final IReportFileEncoder encoder;

    /**
     * Class dependency constructor.
     * @param encoder the class to be used when formatting the report.
     */
    public ReportGenerator(final IReportFileEncoder encoder)
    {
        checkNotNull(encoder);
        this.encoder = encoder;
    }

    /**
     * Saves the file to the filesystem.
     * @param file the file to save.
     */
    private void saveFile(File file)
    {
        //checkNotNull(file);
    }

    /**
     * Saves the report in Excel format. 
     * @param report The report to be saved.
     */
    public void saveExcel(Report report)
    {
        checkNotNull(this.report);
        saveFile(encoder.generateReportExcel(this.report));
    }

    /**
     * Saves the report in Json format.
     * @param report the report to be saved.
     */
    public void saveJson(Report report)
    {
        checkNotNull(report);
        saveFile(encoder.generateReportJson(report));
    }

    /**
     * Saves the Report in XML format. 
     * @param report the report to be saved.
     */
    public void saveXML(Report report)
    {
        checkNotNull(report);
        saveFile(encoder.generateReportXML(report));
    }
}
