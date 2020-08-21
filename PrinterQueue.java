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
import java.lang.Thread;
import java.util.Date;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrinterQueue {
    // object of ReentrantLock of type Lock 
    // class ReentrantLock is a basic implementation of the interface Lock
    private final Lock queueLock = new ReentrantLock();
    
    public void printJob(Object document){
         queueLock.lock();
        try{
           Long duration = (long)(Math.random()*5000);
           System.out.println(Thread.currentThread().getName() + " :PrintQueue: Printing a job during" + (duration/1000) + "seconds::Time " + new Date());
           Double n1 = (double)(Math.random()*100000);
           Double n2 = (double)(Math.random()*100000);
           System.out.println("Calculating " + n1 + " times " + " 3 times " + n2);
           System.out.println("The answer is: " + n1*3*n2);
           
           Thread.sleep(duration);
        } catch(InterruptedException e){
            e.printStackTrace();
        } finally {
            System.out.printf("%s: The document has been printed\n", Thread.currentThread().getName());
            queueLock.unlock();
        }
    }
}
