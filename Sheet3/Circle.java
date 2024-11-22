package Sheet3;

import java.util.Scanner;

class diameter{
    diameter(int r){
        System.out.println("diameter is"+2*r);
    }
}
class circumference {
    circumference(int r){
        System.out.println("circumference is"+ 2*Math.PI*r);
    }
}
class area{
    area(int r){
        System.out.println("area is"+Math.PI*r*r);
    }
}
public class Circle {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        diameter d=new diameter(r);
        circumference c=new circumference(r);
        area a=new area(r);
    }
}
