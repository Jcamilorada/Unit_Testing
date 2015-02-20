package com.cafeto.mockingtest;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.rules.TemporaryFolder;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

import com.cafeto.mockingexample.Reporte;

@RunWith(Theories.class)
public class RulesNTheoriesJUnit {
	
	@DataPoint
	public static Reporte rep1 = new Reporte("Prueba1", "sin datos");
	@DataPoint
	public static Reporte rep2 = new Reporte("Prueba2", "con datos");
	
	// the test will be applied to every @DataPoint defined, and it must pass for all of them
	@Theory
	public void theoriesTest(Reporte report) {
		assertNotEquals(report.getInformacion(), null);
	}
	
	// the annotated field as @Rule will
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
