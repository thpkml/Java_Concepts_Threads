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
public class SharedThreads {
    synchronized void waitMethod(){
        Thread t = Thread.currentThread();
        
        System.out.println(t.getName() + " is releasing the lock and going to wait");
        
        try{
            wait();
            System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
        System.out.println(t.getName() + " has been notified and acquired back in the lock.");
    }
    
    synchronized void notifyAllThread(){
        Thread t = Thread.currentThread();
        
        notifyAll();
        
        System.out.println(t.getName() + " has notified all threads waiting for this object lock.");
    }
          
}
