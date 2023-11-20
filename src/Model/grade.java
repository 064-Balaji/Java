package Model;

import java.util.Scanner;

public class grade {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int data;
        int[] marks = new int[5];
        System.out.println("Welcome to the Mark Grading System");
        for(int i=0; i<5; i++){
            System.out.println("Enter " +(i+1)+ " Marks: ");
            data = sc.nextInt();
            marks[i] = data;
        }

        for(int i=0; i<5; i++){
            if(marks[i]>90 && marks[i]<=100){
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: O(Outstanding)");
                System.out.println("Grade Points: 10");
            }
            else if(marks[i]<=90 && marks[i]>80) {
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: A+(Excellent)");
                System.out.println("Grade Points: 9");
            }
            else if(marks[i]<=80 && marks[i]>70) {
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: A(Very Good)");
                System.out.println("Grade Points: 8");
            }
            else if(marks[i]<=70 && marks[i]>60) {
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: B+(Good)");
                System.out.println("Grade Points: 7");
            }
            else if(marks[i]<=60 && marks[i]>=50) {
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: B(Average)");
                System.out.println("Grade Points: 6");
            }
            else {
                System.out.println("Mark "+i+":-");
                System.out.println("Grade Letter: RA");
                System.out.println("Grade Points: 0");
            }
        }
    }
}
