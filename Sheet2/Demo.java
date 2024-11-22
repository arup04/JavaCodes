package Sheet2;

abstract class Figure{
    public abstract void calcArea();
    public abstract void disparea();
    public abstract void calvol();
    public abstract void dispvol();
}

class cone extends Figure {
    public double calcArea(int r, int h){
        double slant=Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2));
        double result=Math.PI*r*slant;
        return result;
    }
    public void disarea() {
        System.out.println("area of cone is: "+calcArea(5,6));
    }
    public double calvol(int r,int h) {
        double result=((Math.PI)*r*r*h)/3;
        return result;
    }
    public void dispvol() {
        System.out.println("volume of cone is: "+calvol(5,6));
    }
}

class sphere extends Figure{
    public double calcArea(int r){
        double result=4*Math.PI*r*r;
        return result;
    }
    public void disarea() {
        System.out.println("area of sphere is: "+calcArea(6));
    }
    public double calvol(int r,int h) {
        double result=4*((Math.PI)*r*r*r)/3;
        return result;
    }
    public void dispvol() {
        System.out.println("volume of sphere is: "+calvol(5,6));
    }
}
class cylinder extends Figure{
    public double calcArea(int r,int h){
        double result=(2*Math.PI*r)*(h+r);
        return result;
    }
    public void disarea() {
        System.out.println("area of cylinder is: "+calcArea(6,3));
    }
    public double calvol(int r,int h) {
        double result=Math.PI*r*r*h;
        return result;
    }
    public void dispvol() {
        System.out.println("volume of cylinder is: "+calvol(5,6));
    }
}
public class Demo{
    public static void main(String []args) {
        cone c=new cone();
        c.dispvol();
        c.disarea();
        sphere s=new sphere();
        s.disarea();
        s.dispvol();
        cylinder cy=new cylinder();
        cy.disarea();
        cy.dispvol();
    }
}
