package Sheet3;

class x{
    int i;
    int j;
    x(int p,int q){
        i=p;
        j=q;
    }
    public int finalsum() {
        return i+j;
    }
}
class demo extends x{
    demo(int i,int j){
        super(i,j);
    }
    public int findproduct() {
        return i*j;
    }
}
class z extends demo{
    z(int i,int j){
        super(i,j);
    }
    public int difference() {
        return i-j;
    }
}
public class y {
    public static void main(String []args) {
        z obj=new z(4,5);
        System.out.println(obj.finalsum());
        System.out.println(obj.findproduct());
        System.out.println(obj.difference());
    }
}