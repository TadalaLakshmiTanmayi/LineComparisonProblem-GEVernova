import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coordinates for Line 1:");
        Point p1 = new Point(sc.nextInt(), sc.nextInt());
        Point p2 = new Point(sc.nextInt(), sc.nextInt());
        Line line1 = new Line(p1, p2);

        System.out.println("Enter the coordinates for Line 2:");
        Point p3 = new Point(sc.nextInt(), sc.nextInt());
        Point p4 = new Point(sc.nextInt(), sc.nextInt());
        Line line2 = new Line(p3, p4);

        int i = 1;
        do {
            System.out.println("\nChoose an option:");
            System.out.println("1. Calculate the length of lines");
            System.out.println("2. Check equality of two lines");
            System.out.println("3. Compare two lines");
            System.out.println("Enter 0 to exit");
            int input = sc.nextInt();

            switch (input) {
                case 1:
                    System.out.println("Length of Line 1: " + line1.calculateLength());
                    System.out.println("Length of Line 2: " + line2.calculateLength());
                    break;
                case 2:
                    if (line1.equals(line2)) {
                        System.out.println("Both lines are equal.");
                    } else {
                        System.out.println("The lines are not equal.");
                    }
                    break;
                case 3:
                    int comparisonResult = line1.compareTo(line2);
                    if (comparisonResult > 0) {
                        System.out.println("Line 1 is greater than Line 2.");
                    } else if (comparisonResult < 0) {
                        System.out.println("Line 1 is less than Line 2.");
                    } else {
                        System.out.println("Both lines are equal.");
                    }
                    break;
                default:
                    System.out.println("Wrong input");
                    break;
            }

            System.out.println("Enter 0 to exit");
            i = sc.nextInt();
        } while (i != 0);
        System.out.println("Thank You");
        sc.close();
    }
}

// Point class to represent coordinates of a point
class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

// Line class that represents a line segment with two points
class Line implements Comparable<Line> {
    Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    // Calculate the length of the line
    public double calculateLength() {
        return Math.sqrt(Math.pow(end.x - start.x, 2) + Math.pow(end.y - start.y, 2));
    }

    // Implement compareTo to compare lines based on their lengths
    @Override
    public int compareTo(Line other) {
        double thisLength = this.calculateLength();
        double otherLength = other.calculateLength();
        return Double.compare(thisLength, otherLength); // Compare lengths
    }

    // Override equals to check if two lines are equal (based on length)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Line other = (Line) obj;
        return Double.compare(this.calculateLength(), other.calculateLength()) == 0;
    }
}
