/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs4;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author Celeste
 */
public class FileReader implements FileAccessStrategy{

    @Override
    public void getFile(String file){	
        File data = new File(file);
        BufferedReader in = null;
        try {
	   in = new BufferedReader(new java.io.FileReader(data));
	   String line = in.readLine();
	   while(line != null){
		  System.out.println(line);
		  line = in.readLine();  // strips out any carriage return chars
	   }
	 
        } catch(IOException ioe) {
            System.out.println("We have a problem with reading this file");
        } finally {
            try {
                in.close();
            } catch(Exception e) {
                
            }
        }
    }
}


