/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Celeste
 */
public class Lab01part3 {
    
    
    public static void main(String[] args) {
        // let me append to the file
        boolean append = true;
        
        File data = new File("C:\\lab01file.txt"); 

        BufferedReader in = null;
        PrintWriter out = null;
        
        
        try {
            in = new BufferedReader(new FileReader(data));
            out = new PrintWriter(new BufferedWriter(new FileWriter(data, append)));
            String line = in.readLine();
            out.println("\n");
            out.println("Walter Hagen");
            out.println("124 Magnolia Lane");
            out.println("Augusta, GA 88945");
            out.println("whagen@outlook.com");
            out.println("(840) 987-5210");           
            out.close();
            while (line != null) {
                System.out.println(line);
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
    }
}
