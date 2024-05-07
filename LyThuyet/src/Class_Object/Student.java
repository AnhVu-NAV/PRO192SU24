/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class_Object;

/**
 *
 * @author IDEAPAD
 */
public class Student {
    
    private String id;
    private String name;
    private int age;
    private String Class;
    
    public Student(){
        //this("unknow", "unknow", -1, "unknow");
    }
   
    public Student(String id, String name, int age, String Class){
        this.id = id;
        this.name = name;
        this.age  =  age;
        this.Class = Class;
    }
    
    // geter // phuong thuc de lay thong tin, du lieu ve thuco tinh cua doi tg
    // seter // phuong thuc de thay doi thong, thuoc tinh cuar doi tg
    
    public String getId (){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getclass() {
        return this.Class;
    }
    
    public void setId(String id){
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClass(String Class) {
        this.Class = Class;
    }
    
    
    
    

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", age=" + age + ", Class=" + Class + '}';
    }
    
    
    
}
