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
 * @author Celeste
 */
public class FileReader implements FileAccessStrategy{
    
    @Override
    public void getFile(String file) {
        Scanner keyboard = new Scanner(System.in);
        List<String> info = new ArrayList<>();
        File data = new File(file);
        String formattedInfo = "";
        int userSelection;

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
        System.out.println("Please Enter Record Access Number: ");
        userSelection = keyboard.nextInt();

        switch (userSelection) {
            case 1:
                List<String> one = info.subList(0, 5);
                for (String line : one) {
                    formattedInfo += line + "\n";
                }
                System.out.println(formattedInfo);
                break;
            case 2:
                List<String> two = info.subList(6, 11);
                for (String line : two) {
                    formattedInfo += line + "\n";
                }
                System.out.println(formattedInfo);
                break;
            case 3:
                List<String> three = info.subList(12, 17);
                for (String line : three) {
                    formattedInfo += line + "\n";
                }
                System.out.println(formattedInfo);
                break;
            case 4:
                List<String> four = info.subList(18, 23);
                for (String line : four) {
                    formattedInfo += line + "\n";
                }
                System.out.println(formattedInfo);
                break;
            default:
                formattedInfo = "Invalid Selection";
                break;
        }
    }
}
