/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Celeste
 */
public class FileWriter implements WriteToFileStrategy{
    
    @Override
    public void writeFile(String file) throws IOException{
          boolean append = true;
	  File data = new File(file);
	  PrintWriter out = new PrintWriter(
						new BufferedWriter(
						new java.io.FileWriter(data, append)));
	  System.out.println("Data has been written to file, Location is: " + data.getAbsolutePath());
    }
    
    public void writeToFile(String data){
        
    }
    
}
