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
import java.lang.Runnable;
public class AssignmentReader implements Runnable {
    Assignment assignment; // only declaring the variable
    
    // constructor
    public AssignmentReader(Assignment assignment){
        this.assignment = assignment;
    }
    
    @Override
    public void run(){
        synchronized(assignment){
            System.out.println(Thread.currentThread().getName() + " is waiting for the assignment to be completed:  " + assignment.getTitle());
            
            try{
                Thread.sleep(1000);
                System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            
            System.out.println(Thread.currentThread().getName() + ": Assignment has been completed now! you can read it");
            
        }
    }
}

