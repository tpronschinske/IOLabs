/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs4;
import java.io.*;
import java.util.*;
import java.io.File;
import java.io.IOException;



/**
 *
 * @author Celeste
 */
public class TextFileWriter implements WriteToFileStrategy {

    @Override
    public void writeFile(String file) throws IOException {

        File data = new File(file);
        boolean append = true;
        System.out.println("Enter Text To Add To You File");
        Scanner keyboard = new Scanner(System.in);
        String text = keyboard.nextLine();
        PrintWriter out = new PrintWriter(
                new BufferedWriter(
                        new java.io.FileWriter(data, append)));
        try {
            out.print("\n");
            out.print(text);   
            out.close();
        } catch (Exception e) {
            System.out.println("Error Writing To File");
        }
    }
    
    
    
}
