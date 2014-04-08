/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaiolabs2;

/**
 *
 * @author Celeste
 */
public class IndexOutOfBoundsExcpetion extends IllegalArgumentException {
    

    public IndexOutOfBoundsExcpetion()
    {        
    }
    
    public IndexOutOfBoundsExcpetion(String exceptionMessage){
        super(exceptionMessage);
    }
    
    public IndexOutOfBoundsExcpetion(String exceptionMessage, Throwable cause){
        super(exceptionMessage, cause);
    }
    
    public IndexOutOfBoundsExcpetion(Throwable cause){
        super(cause);
    }
    
}
