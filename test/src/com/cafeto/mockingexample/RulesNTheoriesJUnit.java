package com.cafeto.mockingexample;

import com.cafeto.mockingexample.Report;
import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertNotEquals;

@RunWith(Theories.class)
public class RulesNTheoriesJUnit {
	
	@DataPoint
	public static Report rep1 = new Report("Prueba1", "sin datos");
	@DataPoint
	public static Report rep2 = new Report("Prueba2", "con datos");
	
	@Theory
	public void theoriesTest(Report report) {
		assertNotEquals(report.getInformacion(), null);
	}

	@Rule
    public TemporaryFolder folder= new TemporaryFolder();
	
	@Test
	public void rulesTest() throws IOException {
		File createdFile= folder.newFile("myfile.txt");
        File createdFolder= folder.newFolder("subfolder");
        
        System.out.println(createdFile.getName());
        System.out.println(createdFolder.getName());
	}

}
