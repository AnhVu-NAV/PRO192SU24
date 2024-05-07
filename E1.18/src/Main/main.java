/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

import java.util.Scanner;

/**
 *
 * @author IDEAPAD
 */
public class main {
    
     public static String triangle(int[] A, int[] B, int[] C){
         boolean check;
         double ab = Math.sqrt(Math.pow(B[0]-A[0], 2) + Math.pow(B[1]-A[1], 2));
         double ac = Math.sqrt(Math.pow(C[0]-A[0], 2) + Math.pow(C[1]-A[1], 2));
         double bc = Math.sqrt(Math.pow(C[0]-B[0], 2) + Math.pow(C[1]-B[1], 2));
         if(ab + ac > bc && ab + bc > ac && bc + ac > ab){
             check = true;
         }else{
             check = false;
         }
         double perimeter, area;
         
         if(check){
             perimeter = ab + ac + bc;
             double p = perimeter/2;
             area = Math.sqrt(p*(p-ab)*(p-bc)*(p-ac));
         }else{
             perimeter = area = -1;
         }
         return "[" + perimeter + ", " + area + "]";
     }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[2];
        a[0] = sc.nextInt();
        a[1] = sc.nextInt();
        b[0] = sc.nextInt();
        b[1] = sc.nextInt();
        c[0] = sc.nextInt();
        c[1] = sc.nextInt();
        System.out.println(triangle(a, b, c));
    }
}
