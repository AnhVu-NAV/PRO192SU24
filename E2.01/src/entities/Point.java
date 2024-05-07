/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author IDEAPAD
 */
public class Point {
    
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public double distanceTo(Point P){
        double distance = Math.sqrt(Math.pow(P.x - x, 2) + Math.pow(P.y-y, 2));
        return distance;
    }

    @Override
    public String toString() {
        return "Point[" + "x=" + this.x + ", y=" + this.y + ']';
    }
    
}