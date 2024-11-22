package Sheet1;

import java.util.Scanner;
class single_digit{
    single_digit(int x){
//		while(x>0) {
//			int r=x % 10;
//		System.out.print(r);
//		System.out.print(" ");
//
//		x=x/10;
//		}
        int[] digits = new int[5];
        for (int i = 4; i >= 0; i--) {
            digits[i] = x % 10;
            x /= 10;
        }
        for (int i = 0; i<=4; i++) {
            System.out.print(digits[i]);
        }
    }
}
public class digitsseperate {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        single_digit sd=new single_digit(x);
    }
}
