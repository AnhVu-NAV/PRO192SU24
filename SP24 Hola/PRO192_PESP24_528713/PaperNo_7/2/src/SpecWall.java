/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class SpecWall extends Wall{
    private String color;

    public SpecWall() {
    }

    public SpecWall(String place, int area, String color) {
        super(place, area);
        this.color = color;
    }

    @Override
    public String toString() {
        return super.getPlace() + ", " + color + ", " + super.getArea();
    }
    
    public void setData(){
        String s = "";
        for (int i = 0; i < super.getPlace().length(); i++) {
            if(Character.isAlphabetic(super.getPlace().charAt(i))){
                s += super.getPlace().charAt(i);
            }
        }
        super.setPlace(s);
    }
    
    public String getValue(){
        int x = super.getArea()/super.getPlace().length();
        if(super.getArea()%super.getPlace().length() == 0){
            return color + x;
        }else{
            return color;
        }
    }
}
