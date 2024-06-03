/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vungu
 */
public class Zebra {
    private String owner;
    private int weight;

    public Zebra() {
    }

    public Zebra(String owner, int weight) {
        this.owner = owner;
        this.weight = weight;
    }

    public String getOwner() {
        String s = "";
        for (int i = 0; i < this.owner.length(); i++) {
//            if(this.owner.charAt(i) >= '0' && this.owner.charAt(i)<='1'){
//                
//            }
            if(Character.isDigit(this.owner.charAt(i))){
                if((this.owner.charAt(i)-'0') %2 == 0 ){
                    continue;
                }else{
                    s += this.owner.charAt(i);
                }
            }else{
                    s += this.owner.charAt(i);
             }
           
//            if(Character.getNumericValue(this.owner.charAt(i))%2==0){
//                
//            }
        }
        return s;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight - this.owner.length();
    }
    
    
}
