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
public class OrderWriter implements Runnable {
    // declare reference type order
    Order order;
    // constructor for orderWriter
    public OrderWriter(Order order){
        this.order= order;
    }
    @Override
    public void run(){
        // synchronize object order
        synchronized(order){
            System.out.println("Manager starts to write order: "
                    +order.getItem());
            try{
                Thread.sleep(1000);
            } catch(InterruptedException e){
                e.printStackTrace();
            }
            order.setCooked(true);
            System.out.println("Order completed." + order.isCooked());
//            order.notify();
//            System.out.print("notify one chef.");
            order.notifyAll();
            System.out.println("notify all chefs.");
           
        }
    }
}
