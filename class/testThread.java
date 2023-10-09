public class testThread {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        Thread Thread1= new Thread(b);
        Thread Thread2 = new Thread(a);
        try
        {
            Thread1.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        Thread1.start();
        Thread2.start();
        try
        {
            Thread2.sleep(1000);
        }
        catch(InterruptedException e)
        {
            System.out.println("Error");
        }
        System.out.println("Hi everyone");
    }
}
class A implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hi");
        }
    }
}
class B implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            System.out.println("Hello");
        }
    }
}