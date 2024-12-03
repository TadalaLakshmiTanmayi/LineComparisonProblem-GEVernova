public class CalculateLineLength {
    public void lengthcalculation(int x1,int y1,int x2,int y2){
        double length=Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of Line: " + length);

    }
}
