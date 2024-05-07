/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Circle {
    private int r;

    public Circle() {
    }

    public Circle(int r) {
        this.r = r;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }
    
    public double perimeter(){
        return Math.PI*this.r*2;
    }
    
    public double area(){
        return Math.PI * Math.pow(this.r, 2);
    }

    @Override
    public String toString() {
        return "Circle[" + "r=" + r + ']';
    }
    
    
}
