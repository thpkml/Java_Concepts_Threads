/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author admin
 */
import java.lang.Thread;

public class ThreadSample {
    public static void main(String[] args){
        new Thread("One");
        new Thread("Two");
        new Thread("Three");
        
        try{
            Thread.sleep(1000);
            
            Thread.currentThread().getName();
        } catch(InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}
