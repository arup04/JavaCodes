package Sheet9;

class MyThreadClass extends Thread
{
    @Override
    public void run()
    {
        for (int i=0; i<=100; i++)
        {
            System.out.println(i);
        }
    }
}

public class q1
{
    public static void main(String[] args)
    {
        MyThreadClass mtc = new MyThreadClass();
        mtc.start();
        System.out.println(Thread.currentThread().getName());
    }
}
