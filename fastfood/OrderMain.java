/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

/**
 *
 * @author admin
 */
public class OrderMain {
public static void main(String[] arg){
    //order object on which to call wait and notify methods
    Order order1 = new Order("Hamburger and Fries");
    Order order2 = new Order("Avocado Salad");
    OrderReader ChefPeter = new OrderReader(order1);
    OrderReader ChefRicardo = new OrderReader(order1);
    OrderReader ChefAmy = new OrderReader(order2);
    OrderReader ChefSusan = new OrderReader(order2);
    // orderReader threads that will wait for order to cook
    Thread PeterThread = new Thread(ChefPeter, "Peter");
    Thread RicardoThread = new Thread(ChefRicardo, "Ricardo");
    Thread AmyThread = new Thread(ChefAmy, "Amy");
    Thread SusanThread = new Thread(ChefSusan, "Susan");
    // start all four threads
    PeterThread.start();
    RicardoThread.start();
    AmyThread.start();
    SusanThread.start();
    // putting the thread to sleep to make sure the threads are waiting 
    try{
        Thread.sleep(3000);
        System.out.println("PeterThread STATE: "+ PeterThread.getState());
        System.out.println("RicardoThread STATE: "+ RicardoThread.getState());
        System.out.println("AmyThread STATE: "+ AmyThread.getState());
        System.out.println("SusanThread STATE: "+ SusanThread.getState());
    } catch(InterruptedException e){
        e.printStackTrace();
    }
    // OrderWriter threads that will notify once order completes
    OrderWriter orderWriter1 = new OrderWriter(order1);
    OrderWriter orderWriter2 = new OrderWriter(order2);
    Thread orderWriterThread1 = new Thread(orderWriter1);
    Thread orderWriterThread2 = new Thread(orderWriter2);
    orderWriterThread1.start();
    orderWriterThread2.start();
}
}
