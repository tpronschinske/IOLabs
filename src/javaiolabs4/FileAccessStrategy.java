/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs4;

/**
 *
 * @author Celeste
 */
public interface FileAccessStrategy {
    
    public abstract void getFile();
    
    public abstract void writeFile(String file);
    
}
