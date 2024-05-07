/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author IDEAPAD
 */
public class main {
    
    public static boolean checkPassword(String str){
        int chu = 0, so = 0, ktdb = 0;
        if(str.length()>=8){
            for (int i = 0; i < str.length(); i++) {
                if(Character.isAlphabetic(str.charAt(i))){
                    ++chu;
                }else if(Character.isDigit(str.charAt(i))){
                    ++so;
                }else{
                    ++ktdb;
                }
            }
            if(chu >= 6 && so >= 1 && ktdb>=1){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        System.out.println(checkPassword("tanthanh123"));
        System.out.println(checkPassword("12345678"));
        System.out.println(checkPassword("@12345678"));
        System.out.println(checkPassword("thanh123@"));
        System.out.println(checkPassword("tanthanh123@"));
    }
}
