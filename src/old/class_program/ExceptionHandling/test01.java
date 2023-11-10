package old.class_program.ExceptionHandling;

import java.util.Scanner;

public class test01 {
    /*
        Built-in Exception and try-catch method implementation
     */
    public static void main(String []args){
        user_excep obj1 = new user_excep();
        obj1.age_excep();
    }
}


class user_excep{
    Scanner sc = new Scanner(System.in);
    void age_excep(){
        int age;
        try{
            System.out.println("Enter your age:");
            age = sc.nextInt();
            if (age < 18){
                throw new AgeExcept(age);
            }
        }
        catch (AgeExcept e){
            System.out.println("Caught");
        }
    }


}
class AgeExcept extends Exception{
    AgeExcept(int age){
        System.err.println("Sorry your age is " +age+ " not eligible to vote");
    }
}
