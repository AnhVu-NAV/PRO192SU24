/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author IDEAPAD
 */
// int -10 mu 9 -> 10 mu 9
public class Main {
    public static int max(int[]arr){
        int max = (int)-1e9;
        for(int i: arr){
            if(max < i){
                max = i;
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int [] a1 = new int[] {6, 28};
        System.out.println(max(a1));
        int [] a2 = new int[] {12, 28, 42, 36};
        System.out.println(max(a2));
        }
}
