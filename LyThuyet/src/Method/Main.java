/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Method;

/**
 *
 * @author IDEAPAD
 */
public class Main {
    public static void main(String[] args) {
        // funcion, ham X -> phương thức, methood
        // biến X -> thuộc tính
        
        // d/n: mo ta 1 chuc nang duox xay dung trong lap trinh
        // mot khoi cac cau lenh thực 1 loat các hanh dong , nhiem vu nao day
        // phuong thuc tra ve gia tri và phuong thuc ko tra ve gia tri
        
        //- phuong thuc tra ve gia tri:
        //co kieu du lieu là int, float, double,.....
        // co return di kem gia tri
       
//        public static <kieu du lieu> <ten phuong thuc> (tham so){
//            // cac lenh thuc hien
//            return //giatri
//        }
        
        // phuong thuc khong tra ve gia tri
        // phuong thuc co kieu du liau la void
        // vd chuc nang dien hinh: in ra man hinhf, thay doi gia tri,....
//        public static void <ten phuong thuc> (co the cos tham so){
        int tong = Sum(2, 10);
        System.out.println(tong);
        in(2);
        
        // ghi de phuong thuc
        // overloading
        // cung ten nhung dau vao cac thuoc khac khac nhau
        
        // da tham so trong phuong thuc
        System.out.println(Sum(1, 2, 3, 4, 4, 8));
     }

        
    // vd ve phuong thuc tra ve gia tri
    public static int Sum (int a, int b){
//        int sum = a+b;
//        return sum;
        return a+b;
    }
    
    public static int Sum (int a, int b, int c){
        return a+b+c;
    }
    
//    public static int Sum (int a[]){
//        int sum =0;
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//        }
//        return sum;
//    }
    
    public static int Sum (int a, int b, int ...args ){
        int sum = 0;
        for(int i: args){
            sum += i;
        }
        return sum;
    }

    //vd phuong thuc ko tra ve gia tri
    public static void in (int a){
        System.out.println("Hello world"+ a);
    }
    
}
