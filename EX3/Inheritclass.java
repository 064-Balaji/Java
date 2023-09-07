/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritclass;
import java.util.Scanner;

/**
 *
 * @author test05
 */
public class Inheritclass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        person pe = new person();
        student st = new student();
        
        System.out.println("Welcome to College Management System: ");
        
        System.out.println("What you want to Do: ");
        System.out.println("1. Assign Name and Address to person");
        System.out.println("2. Return Name");
        System.out.println("3. Return Address");
        System.out.println("4. Change Address");
        System.out.println("5. Print Everything on person");
        System.out.println("6. Enter Student details");
        System.out.println("7. Return Program");
        System.out.println("8. Change Program");
        System.out.println("9. Return Year");
        System.out.println("10. Set Year");
        System.out.println("11. Return Fee");
        System.out.println("12. Set Fee");
        System.out.println("13. Return Everything from Student");
        System.out.println("14. Enter Staff details");
        System.out.println("15. Return School");
        System.out.println("16. Set School");
        System.out.println("17. Return Pay");
        System.out.println("18. Set Pay");
        
        System.out.println("Select your choice: ");
        int choice = sc.nextInt();
        
        switch(choice){
            case 1:
                String name, address;
                System.out.println("Enter your Name: ");
                name = sc.nextLine();
                System.out.println("Enter your Address: ");
                address = sc.nextLine();
                pe.person(name, address);
                break;
            case 2:
                System.out.println(pe.getName());
                break;
            case 3:
                System.out.println(pe.getAddress());
                break;
            case 4:
                System.out.println("Enter the new address");
                String new_add = sc.nextLine();
                pe.setAddress(new_add);
                break;
            case 5:
                System.out.println("Person class details: ");
                System.out.println(pe);
                break;
            case 6:
                System.out.println("Enter student name: ");
                String stu_name = sc.nextLine();
                System.out.println("Enter student address: ");
                String stu_addr = sc.nextLine();
                System.out.println("Enter Program: ");
                String program = sc.nextLine();
                System.out.println("Enter Year: ");
                int year = sc.nextInt();
                System.out.println("Enter Fee: ");
                double fee = sc.nextDouble();
                st.student(stu_name, stu_addr, program, year, fee);
                break;
            case 7:
                System.out.println("Program info: ");
                System.out.println(st.getProgram());
                break;
            case 8:
                System.out.println("Enter Changing Program: ");
                String new_program = sc.nextLine();
                st.setProgram(new_program);
                break;
            case 9:
                System.out.println(st.getyear());
                break;
            case 10:
                System.out.println("Set year:");
                int year1 = sc.nextInt();
                st.setyear(year1);
                break;
            case 11:
                System.out.println(st.getfee());
                break;
            case 12:
                System.out.println("Enter new Fee: ");
                int fee1 = sc.nextInt();
                st.setfee(fee1);
                break;
            case 13:
                System.out.println("Return everything on Student: ");
                System.out.println(st);
            case 14:
                System.out.println("")
        }
    }
    
}


class person {
    String name, address;
    Scanner sc = new Scanner(System.in);
    
    void person(String n, String a) {
        name = n;
        address = a;
        System.out.println("Hello");
    }
    
    String getName() {
        return name;
    }
    
    String getAddress() {
        return address;
    }
    
    void setAddress(String a) {
        address = a;
    }
    
    @Override
    public String toString() {
        return "name: "+name+"address: "+address;
    }
}

class student extends person {
    String program;
    int year;
    double fee;

    void student(String n, String a, String p, int y, double f) {
        this.name = n;
        this.address = a;
        program = p;
        year = y;
        fee = f;
    }
    
    String getProgram(){
        return program;
    }
    
    void setProgram(String p) {
        program = p;
    }
    
    int getyear(){
        return year;
    }
    
    void setyear(int y) {
        year = y;
    }
    
    double getfee(){
        return fee;
    }
    
    void setfee(double f){
        fee = f;
    }
    
    @Override
    public String  toString(){
        return "name: "+this.name+"Address: " +this.address+ "program: "+program+ "fee"+fee+ "year"+year ;
    }
}

class staff extends person{
    String school;
    double pay;
    
    void staff(String n, String a, String sc, double p){
        this.name = n;
        this.address = a;
        school = sc;
        pay = p;
    }
    
    String getSchool(){
        return school;
    }
    
    void setSchool(String s){
        school = s;
    }
    
    double getPay(){
        return pay;
    }
    
    void setPay(double p){
        pay = p;
    }
    
    @Override
    public String toString(){
        return "name: "+name+ "Address: "+address+ "School: "+school+ "Pay: "+pay;
    }
}