/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

/**
 *
 * @author IDEAPAD
 */
public class EngRemove implements IRemove{

    @Override
    public void bat() {
           System.out.println("Turn on");
    }

    @Override
    public void tat() {
        System.out.println("Turn Off");
    }

    @Override
    public void chuyenkenh() {
        System.out.println("Next channel");
    }

    @Override
    public void tangma() {
        System.out.println("Volumn Up");
    }

    @Override
    public void giamam() {
        System.out.println("Volumn Down");
    }
    
}
