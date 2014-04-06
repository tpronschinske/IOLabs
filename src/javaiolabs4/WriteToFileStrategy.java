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
public interface WriteToFileStrategy {
    
    public abstract void writeFile(String file) throws IOException;
    
    
}
