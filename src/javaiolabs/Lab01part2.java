/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Celeste
 */
public class Lab01part2 {
    
    public static void main(String[] args) {
        
    
      File data = new File("src" + File.separatorChar + "LabOneTestFile.txt");
//	File data = new File(File.separatorChar + "temp" + File.separatorChar 
//                        + "test.txt");
//                + "test.txt");

        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(data));
            String line = in.readLine();
            int counter = 0;
            while (line != null) {
                if(counter > 5 && counter < 12){
                    System.out.println(line);
                }
                counter++;
                line = in.readLine();  // strips out any carriage return chars
            }              

        } catch (IOException ioe) {
            System.out.println("Houston, we have a problem! reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
//    } else
//	     System.out.println("File not found: test.txt");
    } // end main
    
}
