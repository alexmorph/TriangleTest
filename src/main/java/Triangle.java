public class Triangle {

    public TriangleType getTriangleType(int a, int b, int c) {
        boolean result = checkTriangleSideLength(a, b, c);
        if (result == false) {
            System.out.println(" ERROR: Triangle side cannot be equals null or be an negative number!");
            return TriangleType.ERROR;
        } else if (a != b && b != c && a != c) {
            return TriangleType.SCALENE;
        } else if (a == b && b == c && a == c) {
            return TriangleType.EQUILATERAL;
        } else if (a == b || b == c || a == c) {
            return TriangleType.ISOSCELES;
        } else
            return TriangleType.ERROR;
    }

    public boolean checkTriangleSideLength(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0)
            return false;
        else
            return true;
    }

}
