/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package old.ex5.pack3;

/**
 *
 * @author test05
 */
public class calculator {
    public int multiply(int a, int b){
        return a*b;
    }
    public int divide(int a, int b){
        try{
            return a/b;
        }
        catch(ArithmeticException e){
            System.err.println("Divide by zero");
        }
        return 0;
    }
}
    