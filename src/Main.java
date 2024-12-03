import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates for Line 1:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("Enter the coordinates for Line 2:");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        CalculateLineLength findinglength=new CalculateLineLength();
        LineEquality lineEquality = new LineEquality();
        int i =1;
        do{
            System.out.println("\nChoose an option:");
            System.out.println("1. Calculate the length of lines");
            System.out.println("2. Check equality of two lines");
            System.out.println("Enter 0 to exit");
            int input = sc.nextInt();
            switch (input){
                case 1:
                    findinglength.lengthcalculation(x1,y1,x2,y2);
                    findinglength.lengthcalculation(x3, y3, x4, y4);
                    break;
                case 2:
                    lineEquality.checkEquality(x1, y1, x2, y2, x3, y3, x4, y4);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        }while (i!=0);
        System.out.println("Thank You");
        sc.close();
    }
}