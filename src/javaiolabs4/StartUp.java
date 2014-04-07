/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs4;

import java.io.IOException;

/**
 *
 * @author Travis
 */
public class StartUp {
    
    
    public static void main(String[] args) throws IOException {
        
//        FileReader fr = new FileReader();
//        fr.getFile("C:\\lab01file.txt");
//        
//        FileWriter fw = new FileWriter();
//        fw.writeFile("C:\\lab01file.txt");
        
        
          FileAccessStrategy fileAccess = new FileReader();
          fileAccess.getFile("C:\\lab01file.txt");
          
          WriteToFileStrategy writer = new TextFileWriter();
          writer.writeFile("C:\\lab01file.txt");
          
          
        
        
    }
}
