/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Triangle {
    private Point A;
    private Point B;
    private Point C;

    public Triangle() {
    }

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
    }

    public Point getA() {
        return A;
    }

    public void setA(Point A) {
        this.A = A;
    }

    public Point getB() {
        return B;
    }

    public void setB(Point B) {
        this.B = B;
    }

    public Point getC() {
        return C;
    }

    public void setC(Point C) {
        this.C = C;
    }
    
    public boolean isValid(){
        double ab = A.distanceTo(B);
        double ac = A.distanceTo(C);
        double bc = B.distanceTo(C);
        
        // ktra xem tam giac co hop le ko
        if(ab + ac > bc && ab + bc > ac && bc + ac > ab){
             return true;
         }else{
             return false;
         }
    }
    
    public double perimeter(){
        double ab = A.distanceTo(B);
        double ac = A.distanceTo(C);
        double bc = B.distanceTo(C);
        
        return ab + ac + bc;
    }
    
    public double area(){
        double ab = A.distanceTo(B);
        double ac = A.distanceTo(C);
        double bc = B.distanceTo(C);
        
        double p = perimeter()/2;
        return Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
    }

    @Override
    public String toString() {
        return "Traingle[" + "A=" + this.A + ", B=" + this.B + ", C=" + this.C + ']';
    }
    
    
    
}
