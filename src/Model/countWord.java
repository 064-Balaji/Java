package Model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class countWord extends Thread {
    Scanner sc=new Scanner(System.in);
    public static void main(String []args) throws IOException {
        for(int i=0; i<3; i++) {
            countWord wc=new countWord();
            Thread t=new Thread(wc);
            t.start();
        }
    }

    public void run() {
        System.out.println("Enter file name: ");
        String name= sc.nextLine();

        int count = 0;
        try {
            count = words(name);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(name+ ": "+count);
    }

    static int words(String name) throws IOException {
        int words=0, i;
        FileInputStream fi=new FileInputStream(name);
        while ((i=fi.read()) != -1){
            words++;
        }

        return words;
    }
}