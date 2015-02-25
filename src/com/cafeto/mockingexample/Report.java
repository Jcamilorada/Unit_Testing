package com.cafeto.mockingexample;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 
 */
@AllArgsConstructor
public class Report 
{
    /**
     * Title of the Report
     * @param title new value for the Report title.
     * @return The actual value for the Report title
     */
    @Getter
    @Setter
    private String title;

    /**
     * Information contained in the report.
     * @param information new value for the report information field.
     * @return the actual value of the report information.
     */
    @Getter
    @Setter
    private String information;
}
