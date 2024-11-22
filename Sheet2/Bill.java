package Sheet2;

class Invoice{
    private String part_num;
    private String part_des;
    private int quantity;
    private double price;
    Invoice(String part_num,String part_des,int quantity,double price){
        if(quantity<0) {
            quantity=0;
        }
        if(price<0) {
            price=0.0;
        }
        this.part_num=part_num;
        this.part_des=part_des;
        this.quantity=quantity;
        this.price=price;
    }
    public String getpart_num() {
        return part_num;
    }
    public void setpart_num(String part_num) {
        this.part_num=part_num;
    }
    public String getpart_des() {
        return part_des;
    }
    public void setpart_des(String part_des) {
        this.part_des=part_des;
    }
    public int getquantity() {
        return quantity;
    }
    public void setquantity(int quantity) {
        this.quantity=quantity;
    }
    public double getprice() {
        return price;
    }
    public void setprice(double price) {
        this.price=price;
    }

    public double amount() {
        return quantity*price;
    }
}

public class Bill {
    public static void main(String []args) {

        Invoice in=new Invoice("ABC","Biscuit",5,400);
        System.out.println(in.amount());
    }
}

