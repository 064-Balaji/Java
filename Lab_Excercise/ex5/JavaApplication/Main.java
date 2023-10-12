/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication;
import java.util.Scanner;
import pack1.MathOperations;
import pack2.StringOperation;
import pack3.calculator;
/**
 *
 * @author test05
 */
public class Main {
   
    
    
    public static void main(String [] args){
        MathOperations cls1 = new MathOperations();
        StringOperation cls2 = new StringOperation();
        calculator cls3 = new calculator();
        Scanner sc = new Scanner(System.in);
        int a,b;
        String str1, str2;
        int choice = 0;
        while(choice != 7){
        System.out.println("Choose the action to perform"); 
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. String Reverse");
        System.out.println("6. Concatenate String");
        System.out.println("7. Exit");
        
        
        
            choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Addition operation");
                    System.out.println("Enter element 1");
                    a = sc.nextInt();
                    System.out.println("Enter element 2");
                    b = sc.nextInt();
                    System.out.println(cls1.add(a, b));
                    break;
                case 2:
                    System.out.println("Subtraction operation");
                    System.out.println("Enter element 1");
                    a = sc.nextInt();
                    System.out.println("Enter element 2");
                    b = sc.nextInt();
                    System.out.println(cls1.sub(a, b));
                    break;
                case 3:
                    System.out.println("Multiplication operation");
                    System.out.println("Enter element 1");
                    a = sc.nextInt();
                    System.out.println("Enter element 2");
                    b = sc.nextInt();
                    System.out.println(cls3.multiply(a, b));
                    break;
                case 4:
                    System.out.println("Division operation");
                    System.out.println("Enter element 1");
                    a = sc.nextInt();
                    System.out.println("Enter element 2");
                    b = sc.nextInt();
                    System.out.println(cls3.divide(a, b));
                    break;
                case 5:
                    System.out.println("String Reverse");
                    System.out.println("Enter String");
                    str1 = sc.next();
                    System.out.println(cls2.reverse(str1));
                    break;
                case 6:
                    System.out.println("String Concatenate");
                    System.out.println("Enter String 1");
                    str1 = sc.next();
                    System.out.println("Enter String 2");
                    str2 = sc.next();
                    System.out.println(cls2.concatenate(str1, str2));
                    break;
            }
        }
    }
    
}
