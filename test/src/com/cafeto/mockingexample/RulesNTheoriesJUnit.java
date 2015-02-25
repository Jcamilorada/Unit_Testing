package com.cafeto.mockingexample;

import static org.junit.Assert.assertNotEquals;

import java.io.File;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

/**
 * Example testing class for JUnit Theories and Rules.
 */
@RunWith(Theories.class)
public class RulesNTheoriesJUnit
{
    @DataPoint
    public static Report rep1 = new Report("Test1", "without data");
    @DataPoint
    public static Report rep2 = new Report("Test2", "with data");
    
    @Theory
    public void theoriesTest(Report report) {
        assertNotEquals(report.getInformation(), null);
    }
    
    @Rule
    public TemporaryFolder folder= new TemporaryFolder();
    
    @Test
    public void rulesTest() throws IOException {
        File createdFile= folder.newFile("myFile.txt");
        File createdFolder= folder.newFolder("subFolder");
        
        System.out.println(createdFile.getName());
        System.out.println(createdFolder.getName());
    }
}
