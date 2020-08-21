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
public class AssignmentTest {
    public static void main(String[] args){
//        Assignment object on which wait and notify method will be called
        Assignment assignment = new Assignment("Advanced Programming Concepts");
        AssignmentReader johnReader = new AssignmentReader(assignment);
        AssignmentReader tomReader = new AssignmentReader(assignment);
        
//        AssignmentReader threads which will wait for completion of assignment
        Thread johnThread = new Thread(johnReader, "John");
        Thread tomThread = new Thread(tomReader, "Tom");
        System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
        johnThread.start();
        tomThread.start();
        
//        To ensure both readers started waiting for the book
        try{
            Thread.sleep(3000);
            System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
        } catch(InterruptedException e){
            e.printStackTrace();
        }
        
//        BookWriter thread which will notify once book gets completed
        AssignmentWriter assignmentWriter = new AssignmentWriter(assignment);
        Thread assignmentWriterThread = new Thread(assignmentWriter);
        System.out.println("The thread: " + Thread.currentThread().getName() + " has state: " + Thread.currentThread().getState() );
        assignmentWriterThread.start();
    }
}
