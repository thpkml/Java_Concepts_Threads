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

public class ThreadStates implements Runnable {
    
//    override the run method in Runnable Interface
    @Override
    public void run(){
        System.out.println("I am also a new thread.");
    }
//    create a new thread
    public static void main(String[] args){
        Thread thread1 = new Thread(new ThreadStates());
        System.out.println("The state of thread1 is: " + thread1.getState());
        // start the thread
        thread1.start();
        // check the state of the thread
        System.out.println("The state of thread1 is: " + thread1.getState());
        System.out.println("The state is now: " + thread1.getState());
    }
}
