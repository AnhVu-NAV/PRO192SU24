/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author IDEAPAD
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(simplifyFractions(8, 6));
        System.out.println(simplifyFractions(13, 23));
        System.out.println(simplifyFractions(20, 4));
    }
    
    public static int gcd1(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a%b);
    }
    
    public static int gcd(int a, int b){
        while(b != 0){
            int tmp = a;
            a = b;
            b = tmp%b;
        }
        return a;
    }
    
    
    public static String simplifyFractions(int a, int b){
        int chung = gcd(a,b);
        return "" + (a/chung) + "/" + (b/chung);
    }
}
