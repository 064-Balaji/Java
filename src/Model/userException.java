package Model;

import java.util.Scanner;

public class userException {
    public static void main(String []args) throws HelloException, charException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome to the Exception Handler");
        System.out.println("Try to enter the word Hello");
        String word=sc.nextLine();
        if(word.equals("hello")){
            throw new HelloException("Hello is occured");
        }

        System.out.println("Enter the numbers for Addition");
        String num1= sc.nextLine();
        String num2= sc.nextLine();
        if(!num1.matches("[A-Z a-z]") || !num2.matches("[A-Z a-z]")){
            throw new charException("Character was found");
        }
        else {

        }
    }
}

class HelloException extends Exception{

    public HelloException(String message) {
        super(message);
        System.err.println(message);
    }
}

class charException extends Exception{
    public charException(String message){
        super(message);
        System.err.println(message);
    }
}