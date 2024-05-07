/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object;

/**
 *
 * @author IDEAPAD
 */
public class main {
    public static void main(String[] args) {
//        Rectangle r = new Rectangle();
//        r.height = 10;
//        r.width = 5;
//        System.out.println(r.area());
        Student s = new Student();
        System.out.println(s.toString());
        Student s1 = new Student("HE12345", "Nguyen Van A" , 20, "SE7352");
        System.out.println(s1.toString());
        Student s2 = new Student(s1.getId(), s1.getName(), s1.getAge(), s1.getclass());
        System.out.println(s2.toString());
        s2.setAge(25);
        System.out.println(s2.toString());
    }
}
