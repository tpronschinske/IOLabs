/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs3;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Travis
 */
public class StartUp {
    
 
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        List<String> info = new ArrayList<>();
        File data = new File("C:\\lab01file.txt");
        String formattedInfo = "";
        int userSelection = 8;
        
        BufferedReader in = null;
        try {
            in = new BufferedReader(new java.io.FileReader(data));
            String line = in.readLine();
            while (line != null) {         
                info.add(line);
                line = in.readLine();  // strips out any carriage return chars    
            }
           
        } catch (IOException ioe) {
            System.out.println("Error reading this file");
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
        }
        if(userSelection == 8){
            String city = info.get(userSelection);
            city = (String) city.subSequence(0, city.length()-10);
            System.out.println(city);
        }
        
    }
}


    

