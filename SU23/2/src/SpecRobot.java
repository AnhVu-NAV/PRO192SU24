/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class SpecRobot extends Robot{
    private int step;

    public SpecRobot() {
    }

    public SpecRobot(String label, int type, int step) {
        super(label, type);
        this.step = step;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + this.step;
    }
    
    public void setData (){
        String s = "" +  super.getLabel().charAt(0) + this.step + super.getLabel().substring(2);
        super.setLabel(s);
    }
    
    public int getValue(){
        if(super.getType() < 3 && super.getLabel().contains("A")){
            return step;
        }else{
            return step+2;
        }
    }
}
