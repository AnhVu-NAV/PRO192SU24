/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    private int discount;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity, int discount) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.discount = discount;
    }

    public void setDiscount(int discount) {
        if(discount < 0){
            this.discount = 0;
        }else{
            this.discount = discount;
        }
    }

    @Override
    public String toString() {
        double subTotal = this.quantity * this.price *(100-this.discount)/100;
        return "" + this.id + "," + this.name + "," + String.format("%.2f", this.price) + "," + this.quantity + "," + String.format("%.2f", subTotal);
    }
    
    
    
}
