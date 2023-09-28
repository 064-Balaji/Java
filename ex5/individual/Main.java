import java.util.Scanner;
import Year1.year1;
import Year2.year2;

public class Main {
    String name;
    int rollno;
    Main(String name,int rollno){
        this.name = name;
        this.rollno = rollno;
    }
        public static void main(String[] args) {
            String name;
            int rollno,sub1,sub2,sub3,sub4;
            Scanner scan =  new Scanner(System.in);
            System.out.print("Enter the number of students : ");
            int n = scan.nextInt();    
            Main[] student = new Main[n];
            year1[] y1 = new year1[n];
            year2[] y2 = new year2[n];
            for (int i = 0; i < n; i++) {
                System.out.print("\nEnter the Roll-No : ");
                rollno = scan.nextInt();
                System.out.print("Enter the name : ");
                name= scan.next();
                System.out.print("Enter Year I marks : ");
                sub1 = scan.nextInt();
                sub2 = scan.nextInt();
                y1[i] = new year1(sub1,sub2);
                System.out.print("Enter Year II marks : ");
                sub3 = scan.nextInt();
                sub4 = scan.nextInt();
                y2[i] = new year2(sub3,sub4);
                student[i] = new Main(name,rollno);
            }

            for (int i = 0; i < n; i++) {
                System.out.println("\nName : "
                                    + student[i].name 
                                    + "\nRoll : "
                                    + student[i].rollno
                                  );
                System.out.println("Year I Marks  : " 
                                    + y1[i].sub1Marks 
                                    + ((y1[i].sub1Marks > 50) ? "-Pass" : "-Fail") 
                                    + "  " + y1[i].sub2Marks 
                                    + ((y1[i].sub2Marks > 50) ? "-Pass" : "-Fail")
                                  );
                System.out.println("Year II Marks : " 
                                    + y2[i].sub3Marks 
                                    + ((y2[i].sub3Marks > 50) ? "-Pass" : "-Fail") 
                                    + "  " + y1[i].sub2Marks 
                                    + ((y2[i].sub4Marks > 50) ? "-Pass" : "-Fail")
                                  );
            }
        }


}

