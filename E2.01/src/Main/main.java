/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import entities.Point;
import entities.Triangle;

/**
 *
 * @author IDEAPAD
 */
public class main {
    public static void main(String[] args) {
        Point A = new Point(1, 1);
        Point B = new Point(1, 4);
        Point C = new Point(5, 1);
        
        Triangle triangle = new Triangle(A, B, C);
        
        System.out.println(triangle);
        System.out.println(triangle.isValid());
        System.out.println(triangle.perimeter());
        System.out.println(triangle.area());
    }
}
