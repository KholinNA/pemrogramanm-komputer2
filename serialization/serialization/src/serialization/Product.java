/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

import java.io.Serializable;

/**
 *
 * @author arissetyawan
 */
public class Product implements Serializable {
    protected String name;
    protected Integer price;
    protected Integer stock;
    protected Integer total;
    private Integer quantity;
    protected Integer totaldiskon;
    protected Integer totalbayar;
    

    Product(String name, Integer stock, Integer price)
    {
        this.stock = stock;
        this.name = name;
        this.price = price;
    }

    protected String info(){
        return "Name: " + this.name +", Price: " + this.price +", QTY: " + 
                this.quantity + ", Total: " + this.total + ", total diskon: " + this.totaldiskon+"total bayar : "+this.totalbayar+", stock " + this.stock;
    }
    protected Integer buy(Integer quantity)
    {
        this.quantity = quantity;
        this.total = quantity * this.price;
        this.stock -= quantity;
        this.totaldiskon=this.total*10/100;
        this.totalbayar = this.total-this.totaldiskon;
        return this.total;
    }          
    
  protected Integer getTotal()
    {
        return this.total;
    }
}
