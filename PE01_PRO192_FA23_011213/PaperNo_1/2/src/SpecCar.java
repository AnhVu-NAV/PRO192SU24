/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class SpecCar extends Car{
    private int warranty;

    public SpecCar() {
    }

    public SpecCar(String name, double price, int warranty) {
        super(name, price);
        this.warranty = warranty;
    }

    public int getWarranty() {
        if(super.getName().equalsIgnoreCase("Audi")){
            return this.warranty + 5;
        }else{
            return this.warranty + 2;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.getWarranty(); 
    }
    
    
    
}
