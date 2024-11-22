package Sheet1;

interface squarecube {
    int square(int n);
    int cube(int n);
}
class user implements squarecube{

    public int square(int x1) {
        return (x1*x1);
    }
    public int cube(int x1) {
        return x1*x1*x1;
    }
    public void generate() {
        for(int i=0;i<=10;i++) {
            System.out.println(square(i)+"\t"+cube(i));
        }
    }
}
public class number {
    public static void main(String []args) {
        user u=new user();
        u.generate();
    }

}
