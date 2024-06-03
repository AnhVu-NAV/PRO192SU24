/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class Car {
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name.toUpperCase();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "" + this.getName() + ", " + String.format("%.2f", this.price);
    }
    
    
}
