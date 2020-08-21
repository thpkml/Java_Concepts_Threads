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

public class PrintingJob implements Runnable{
    
    // declaring reference type
    private PrinterQueue printerQueue;
    
    public PrintingJob(PrinterQueue printerQueue){
        this.printerQueue = printerQueue;
    }
    
    @Override
    public void run(){
        System.out.printf("%s: Going to print a document \n", Thread.currentThread().getName());

        printerQueue.printJob(new Object());
        
    }
}
