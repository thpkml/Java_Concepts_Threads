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

public class ThreadfromThread extends Thread {
    
//    override the run method in Thread class
    @Override
    public void run(){
        System.out.println("I am thread created from Thread class.");
    }
//    create a new thread
    public static void main(String[] args){
        ThreadfromThread threadfromThread = new ThreadfromThread();
  
        // start the thread
        threadfromThread.start();
        // check the state of the thread
        System.out.println("The state of thread1 is: " + threadfromThread.getState());
    }
}

