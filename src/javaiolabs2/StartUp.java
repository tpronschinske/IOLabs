/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs2;

/**
 *
 * @author 
 */
public class StartUp {
 
 
    public static void main(String[] args) {

        
        FileAccessStrategy fas = new FileReader();
        fas.getFile("C:\\lab01file.txt");
        
       
 }

}