package Sheet1;

/*1) Write an application that ask the user to enter two integer, obtain them from user
and print their sum, product, difference and quotient and must be use package
concept in this application.*/

import java.util.Scanner;

public class math {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();

        product p=new product(x,y);
        sum s=new sum(x,y);
        difference d=new difference(x,y);
        quotient q=new quotient(x,y);
    }

}