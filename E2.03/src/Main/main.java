/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import entities.Circle;
import entities.Cone;
import entities.Globular;

/**
 *
 * @author IDEAPAD
 */
public class main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
		System.out.println(circle.perimeter());
		System.out.println(circle.area());
		System.out.println();
		
		
		Cone cone = new Cone(3,5);
		System.out.println(cone.perimeter());
		System.out.println(cone.area());
		System.out.println(cone.volume());
		System.out.println();
		
		
		Globular globular = new Globular(3);
		System.out.println(globular.perimeter());
		System.out.println(globular.area());
		System.out.println(globular.volume());
    }
}
