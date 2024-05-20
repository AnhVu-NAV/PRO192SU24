/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import Controller.Varlidation;

/**
 *
 * @author IDEAPAD
 */
public class Recrangle extends Shape{
    private double width;
    private double length;

    public Recrangle() {
    }

    public Recrangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    @Override
    public double getPerimeter() {
        return (this.width+this.length)*2;
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void printResult() {
        System.out.println("-----Ractangle-----");
        System.out.println("Width: " + this.width);
        System.out.println("Length: " + this.length);
        System.out.println("Area: " + this.getArea());
        System.out.println("Perimeter: " + this.getPerimeter());
    }

    @Override
    public void input() {
        Varlidation var = new Varlidation();
        this.width = var.getInput("Please input side width of Rectangle: ");
        this.length = var.getInput("Please input length of Rectangle: ");
    }
    
}
