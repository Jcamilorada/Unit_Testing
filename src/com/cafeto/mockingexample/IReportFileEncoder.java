package com.cafeto.mockingexample;

import java.io.File;

/**
 * This interface specifies the formats in which a Report can be encoded and its methods.
 */
public interface IReportFileEncoder
{
    /**
     * Generate a file containing the report encoded in XML format.
     * @param report The report Object to be encoded.
     * @return File object of the encoded report.
     */
    public File generateReportXML(Report report);

    /**
     * Generate a file containing the report encoded in Excel format.
     * @param report The report Object to be encoded.
     * @return File object of the encoded report.
     */
    public File generateReportExcel(Report report);

    /**
     * Generate a file containing the report encoded in Json format.
     * @param report The report Object to be encoded.
     * @return File object of the encoded report.
     */
    public File generateReportJson(Report report);
}
