/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs2;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author 
 */
public class StartUp {
 
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        List<String> info = new ArrayList<>();
        File data = new File("C:\\lab01file.txt");
        String formattedInfo = null;
        
        BufferedReader in = null;
        try {
            in = new BufferedReader(new java.io.FileReader(data));
            String line = in.readLine();
            while (line != null) {         
                info.add(line);
                for(String line1: info){ // attempted format for arrayList in order to outprint the result...not working???
                    formattedInfo += line1 + "\n";
                }
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
        List<String> one = info.subList(1, 5);
        List<String> two = info.subList(7, 11);
        List<String> three = info.subList(13, 17);
      
        String userInput;        
        int userSelection;

        System.out.println("Please Enter Record Access Number: ");
        userSelection = keyboard.nextInt();

        switch (userSelection) {
            case 1:
                System.out.println(one);
                break;
            case 2:
                System.out.println(two);
                break;
            case 3:
                System.out.println(three);
                break;
           
            default:
                formattedInfo = "Invalid Selection";
                break;
        }
    }
}

