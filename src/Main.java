import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the coordinates:");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 =sc.nextInt();
        int y2 = sc.nextInt();
        CalculateLineLength findinglength=new CalculateLineLength();
        int i =1;
        do{
            System.out.println("Enter 1 to Calculate the length\n");
            int input = sc.nextInt();
            switch (input){
                case 1: findinglength.lengthcalculation(x1,y1,x2,y2);
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }
            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        }while (i!=0);
        System.out.println("Thank you");
        sc.close();
    }
}