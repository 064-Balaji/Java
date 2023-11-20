package Model;

import java.util.Scanner;
import java.lang.Exception;

public class doctorException {
    public static void main(String []args) throws AgeNotWithinRange, NameNotValid{
        Scanner sc=new Scanner(System.in);
        System.out.println("Welcome Doctor!");
        System.out.println("Enter your age");
        int age= sc.nextInt();
        if(age<25 || age>65){
            throw new AgeNotWithinRange("You are not with in the age range");
        }

        System.out.println("Enter your name: ");
        sc.nextLine();
        String name= sc.nextLine();
        if(! name.matches("[A-Z a-z]")){
            throw new NameNotValid("nothing to say");
        }
    }
}

class AgeNotWithinRange extends Exception{
    public AgeNotWithinRange(String message){
        super(message);
        System.err.println("Age not within range Booiii");
    }
}

class NameNotValid extends Exception{
    public NameNotValid(String message){
        super(message);
        System.err.println("Name is not valid have more than the characters");
    }
}
