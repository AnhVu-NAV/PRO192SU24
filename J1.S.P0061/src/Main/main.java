/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import entity.Circle;
import entity.Recrangle;
import entity.Shape;
import entity.Triangle;

/**
 *
 * @author IDEAPAD
 */
public class main {
    public static void main(String[] args) {
        main main = new main();
        Shape rec = new Recrangle();
        rec.input();
        Shape circle = new Circle();
        circle.input();
        Shape triangle = new Triangle();
        triangle.input();
        main.display(rec, circle, triangle);
    }
    
    public void display(Shape rec, Shape circle, Shape triangle){
        rec.printResult();
        circle.printResult();
        triangle.printResult();
    }
}
