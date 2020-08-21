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
public class OrderReader implements Runnable {
    Order order; // declare reference type
    // constructor
    public OrderReader(Order order){
        this.order = order;
    }
    @Override
    public void run(){
        // synchronize object order
        synchronized(order){
            System.out.println(Thread.currentThread().getName() 
                    + " is waiting for " + order.getItem() + " to cook");
            try{
                order.wait();
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() 
                    + " says: Order is completed.");
        }
    }
}
