/* I/O Streams are classified into two types:
    Byte:
        -Input Stream
            *File Input
    Character
*/

package Practice.IOStream;

import java.io.*;
import java.util.Scanner;

public class IOStream {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome");
        ByteStream bs=new ByteStream();

        System.out.println("1.File Input Stream"+"2.Buffered Input Stream");
        int choice = sc.nextInt();

        switch (choice){
            case 1:
                bs.fileio();
                break;

            case 2:
                bs.bufferedio();
                break;
        }
    }
}


class ByteStream{
    Scanner sc=new Scanner(System.in);
    //File Input Stream
    void fileio() throws IOException {
        System.out.println("Enter Which operation to perform: \n"+"1.Read   2.Write");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the name of the file");
            String name= sc.next();
            FileInputStream fi=new FileInputStream(name);

            int i=0;
            while ((i=fi.read())!=-1){
                System.out.print((char) i);
            }

            fi.close();
        }
        else if (choice == 2) {
            System.out.println("Enter the name of the file: ");
            String name = sc.next();
            FileOutputStream fo=new FileOutputStream(name);

            System.out.println("Enter the content to store: \n");
            sc.nextLine();
            String data = sc.nextLine();
            byte b[]= data.getBytes();
            fo.write(b);
            fo.close();
        }
    }

    void bufferedio() throws IOException {
        System.out.println("Enter Which operation to perform: \n"+"1.Read   2.Write");
        int choice = sc.nextInt();

        if(choice == 1){
            System.out.println("Enter the name of the file");
            String name= sc.next();
            FileInputStream fi=new FileInputStream(name);
            BufferedInputStream bf=new BufferedInputStream(fi);

            int i=0;
            while ((i=bf.read())!=-1){
                System.out.print((char) i);
            }

            fi.close();
        }
        else if (choice == 2) {
            System.out.println("Enter the name of the file: ");
            String name = sc.next();
            FileOutputStream fo=new FileOutputStream(name);
            BufferedOutputStream bf=new BufferedOutputStream(fo);

            System.out.println("Enter the content to store: \n");
            sc.nextLine();
            String data = sc.nextLine();
            byte b[]= data.getBytes();
            bf.write(b);
            fo.close();
        }
    }
}