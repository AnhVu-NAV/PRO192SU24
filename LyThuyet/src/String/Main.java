/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package String;

/**
 *
 * @author IDEAPAD
 */
public class Main {
    
    public static void main(String[] args) {
    //dn: chuoi cac ki tu
    // mang có ptu co kieu du lieu la char
    
    // khai bao
    String s; //blank
    String s1 = ""; //empty
    
    // cac phuong thuc o trong string
    
    // duyet chuot
//    for(int i=0; i<s.length(); ++i){
//    
//    }
    //lay do dai cua chuoi
    //s.length();
    s ="abcxsy hello world";
//    System.out.println(s.length());
        
    // truy van den vi tri cua ptu thu i
    // s[i] --> mang cuar cac chuoi
    //s.charAt(2); --> l 
    
    // so sanh cac chuoi
    //s.compareTo(s1);
    //s.compareToIgnoreCase(s1); // ko phan biet hoa thuong
    
    //hello
    //aELLO
    
//        nguyen li hoat dong tuong nhu strcmp
//                s = s1 -> 0
//                s > s1 -> lon 0 
//                s < s1 -> nho 0

    s1 = "hello";
    //System.out.println(s.compareTo(s1));
//    acssi h: 104
//           H: 72

    // noi cac cuoi
   // s.concat(s1); // noi s1 vao cuoi chuoi s
    //hello worldaello
    //ktra chuoi con
        //System.out.println(s.contains(s1));
        
    // ktra chuoi con bat dau va ket thuc
    s.endsWith(s1); // s1 co keets thuc trong s ko
    s.startsWith(s1); // s1 cos bat dau trong s ko
    
    // so sanh chuoi co bang nhau hay ko
    s.equals(s1); 
    // bang tra ve true, ko bang tra ve false
    
    // dinh dang chuoi
    int a = 10;
    s.format("so cua ba la %d", a);
    
    // cac phuong thuc ktra tra rong
    
    s.isEmpty();
    //s.isBlank(); -> co mat trong jdk 20 trow di
            
    // xu li ki tu trong chuoi
    s.toLowerCase();
    s.toUpperCase();
    s.toCharArray(); //-> chuyen chuoi thanh mang cac ki tu
    //String s; -> char []s;
    hello -> h,e,l,l,o
    // cat chuoi
    // tim tu co do dai dai nhat 
    // tim tu xuat hien nhieu nhat
    //.....
    s.split(" ");
    //helle world
    // StringBuilder
    StringBuilder s2 = new StringBuilder(s);
    
    // cat chuoi tu dau den dau
//    s2.substring(1); // cat chuoi tu vtri 1 den het chuoi
//    s2.substring(2, 5); // cat chuoi tu 2 cho 5-1
//    
//    s2.append(s); // them vao cuoi
//    s2.insert(2, "c"); // chen ki tu, chuoi, .... vao vij tri index
//    s2.delete(1, 3); // xoa cac ki tu tu 1 den 3-1
        System.out.println(s2.replace(2, 3, s1));
//    s2.replace(2, 5, s1); // den end -1
//    s2. reverse(); // dao nguoc chuoi
            
    }
    
}
