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
public class ThreadfromRunnable implements Runnable {
    
//    override the run method in Thread class
    @Override
    public void run(){
        System.out.println("I am thread created from Runnable Interface.");
    }
//    create a new thread
    public static void main(String[] args){
        Thread threadfromRunnable = new Thread(new ThreadfromRunnable());
  
        // start the thread
        threadfromRunnable.start();
        // check the state of the thread
        System.out.println("The state of thread1 is: " + threadfromRunnable.getState());
    }
}