/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object;

/**
 *
 * @author IDEAPAD
 */
public class Rectangle {
    public int width;
    public int height;
    
    public Rectangle(){
        width = 0;
        height = 0;
    }
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public double area(){
        return width*height;
    }
    
    public double perimeter(){
        return (width+height)*2;
    }
}
