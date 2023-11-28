package Practice.IOStream.Thread;

public class SychronizedThread {
    public static void main(String []args) throws InterruptedException {
        tables t1=new tables(3);
        tables t2=new tables(4);

        t1.start();
        t1.join();
        t2.start();
    }
}


class tables extends Thread{
    int num;
    tables(int num){
        this.num = num;
    }
    synchronized public void run(){
        mul();
        add();
    }

    void mul(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + num + " = " + i * num);
            }
        }
    }

    void add(){
        synchronized (this) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " + " + num + " = " + (i + num));
            }
        }
    }
}