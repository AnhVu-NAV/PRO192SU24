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
public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public void printResult() {
        System.out.println("-----Circle-----");
        System.out.println("Radius: "+this.r);
        System.out.println("Area: "+ this.getArea());
        System.out.println("Perimeter: "+ this.getPerimeter());
    }

    @Override
    public void input() {
        Varlidation var = new Varlidation();
        this.r = var.getInput("Please input radius of Circle: ");
    }
    
    
}
