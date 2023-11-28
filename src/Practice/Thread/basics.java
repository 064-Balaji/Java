package Practice.IOStream.Thread;

public class basics {
    public static void main(String []args){
        countThread t1 = new countThread("Good Morning");
        countThread t2 = new countThread("Welcome to the Kinder Land");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.setPriority(3);
        t2.setPriority(10);
        t1.setName("First Thread");
        t2.setName("Second Thread");

        System.out.println(t1.getName());
        System.out.println(t2.getName());
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());

        t1.start();
        t2.start();

    }
}

class countThread extends Thread{
    String msg;
    countThread(String msg){
        this.msg = msg;
    }

    public void run() {
        try {
            sender(msg);
            Thread.sleep(5000);
            receiver(msg);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void sender(String msg) throws InterruptedException {
        System.out.println("\t\tSender\n");

        System.out.println("Sending: " +msg);
        Thread.sleep(1000);
        System.out.println(msg+" sent.");
    }

    public void receiver(String msg){
        System.out.println("\t\tReceiver\n");
        System.out.println("Received: "+msg);
    }
}
