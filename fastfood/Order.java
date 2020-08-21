/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fastfood;

/**
 *
 * @author kamaliMac
 */
public class Order {
    String item;
    boolean isCooked;
    // constructor
    public Order(String item){
        this.item = item;
    }
    // get and set methods for item and isCooked
    public String getItem(){
        return item;
    }
    public void setItem(String item){
        this.item = item;
    }
    public boolean isCooked(){
        return isCooked;
    }
    public void setCooked(boolean isCooked){
        this.isCooked = isCooked;
    }
}
