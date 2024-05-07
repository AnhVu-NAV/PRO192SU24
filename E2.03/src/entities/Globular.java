/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Globular extends Circle{

    public Globular() {
    }

    public Globular(int r) {
        super(r);
    }

    @Override
    public double area() {
        return 4 * super.area();
    }
    
    public double volume(){
        return this.area() * super.getR()/3;
    }

    @Override
    public String toString() {
        return "Globular[" + "r=" + super.getR() + ']';
    }
    
    
}
