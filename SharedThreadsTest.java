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
public class SharedThreadsTest {
    public static void main(String[] args){
        final SharedThreads s = new SharedThreads();
        
//        Thread t1 will be waiting for lock of object - 's'

//      consider the thread like a wrapper that wraps the s.waitmethod() in order to manipulate it.        
        Thread t1 = new Thread(){
            @Override
            public void run(){
                s.waitMethod();
            }
        };
        t1.start();
        
//        Thread t2 will be waiting for lock of object - 's'
        
        Thread t2 = new Thread(){
            @Override
            public void run(){
                s.waitMethod();
            }
        };
        
        t2.start();
        
//        Thread t3 will be waiting for lock of object - 's'

        Thread t3 = new Thread(){
            @Override
            public void run(){
                s.waitMethod();
            }
        };
        
        t3.start();
        
        try{
            Thread.sleep(2000);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
//        Thread 4 will notify all threads which are waiting for lock of object - 's'
        
        Thread t4 = new Thread(){
            @Override
            public void run(){
                s.notifyAllThread();
            }
        };
        
        t4.start();
    }
}
