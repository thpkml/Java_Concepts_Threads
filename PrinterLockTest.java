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

public class PrinterLockTest {
    public static void main(String[] args){
        PrinterQueue printerQueue = new PrinterQueue();
        Thread thread[] = new Thread[10];
        for(int i = 0; i < 10; i++){
            thread[i] = new Thread(new PrintingJob(printerQueue), "Thread" + i);
        }
        for(int i = 0; i < 10; i++){
            thread[i].start();
        }
    }
}
