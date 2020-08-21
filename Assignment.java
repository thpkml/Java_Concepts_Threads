/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author luisadominguez
 */

public class Assignment {
    String title;
    boolean isCompleted;
    
//  constructor
    public Assignment(String title){
//        super(); 
        this.title = title;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title){
        this.title = title; 
    }
    
    public boolean isCompleted(){
        return isCompleted;
    }
    
    public void setCompleted(boolean isCompleted){
        this.isCompleted = isCompleted;
    }
}
