package Sheet1;

/*Q2) Write an application that asks user to enter two integer, obtain them from the
user and display the larger number followed by the word "is larger". if the numbers
are equal, print the" the number are equal". Path and Classpath Concept use in this
Application.*/

import java.util.Scanner;

class Larger{
    Larger(int x,int y){
        if(x>y) {
            System.out.println("x is larger than y");
        }
        else {
            System.out.println("x is smaller than y");
        }
    }
}
class Equals{
    Equals(int x,int y){
        if(x==y) {
            System.out.println("x is equal to y");
        }else {
            System.out.println("Numbers are not equal");
        }
    }
}
public class LargerEqual {
    public static void main(String []args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        Larger l=new Larger(x,y);
        Equals e=new Equals(x,y);

    }
}

