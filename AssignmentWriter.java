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

public class AssignmentWriter implements Runnable{
    Assignment assignment; // only declaring the variable
    
    // constructor
    public AssignmentWriter(Assignment assignment){
        this.assignment = assignment;
    }
    
    @Override
    public void run(){
        synchronized (assignment){
            System.out.println("Unit Coordinator is starting to write the assignment: "+ assignment.getTitle());
            
            try{
                Thread.sleep(1000);
                System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            
            assignment.setCompleted(true);
            System.out.println("Assignment has been completed now");
            
//            assignment.notify();
//            System.out.println("notify one reader");
            
            assignment.notifyAll();
            System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
            System.out.println("notify all readers");
        }
    }
}
