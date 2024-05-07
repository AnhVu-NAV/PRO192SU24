/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Cone extends Circle{
    private int h;

    public Cone() {
    }

    public Cone(int r, int h) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public double area() {
        return super.area() + Math.PI*super.getR()*this.h;
    }

    @Override
    public double perimeter() {
        return super.getR() * Math.PI + this.h;
    }
    
     public double volume(){
         return super.area() * this.h/3;
     }

    @Override
    public String toString() {
       return "Cone[" + "r=" + super.getR() + "h=" + h + ']';
    }
    
     
    
    
}
