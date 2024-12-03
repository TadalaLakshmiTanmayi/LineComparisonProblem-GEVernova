public class LineEquality {
    public void checkEquality(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        // Calculate the lengths of both lines
        Double length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        Double length2 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2));

        // Use equals() to compare Double objects
        if (length1.equals(length2)) {
            System.out.println("Both lines are equal.");
        } else {
            System.out.println("The lines are not equal.");
        }
    }
}
