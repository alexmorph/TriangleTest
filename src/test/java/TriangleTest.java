import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void testEquilateralType(){
        Triangle triangle = new Triangle();
        TriangleType type = triangle.getTriangleType(20, 20, 20);
        Assert.assertEquals(TriangleType.EQUILATERAL, type );
    }

    @Test
    public void testScaleneType(){
        Triangle triangle = new Triangle();
        TriangleType type = triangle.getTriangleType(10, 20, 30);
        Assert.assertEquals(TriangleType.SCALENE, type );
    }

    @Test
    public void testIsoscelesType(){
        Triangle triangle = new Triangle();
        TriangleType type = triangle.getTriangleType(20, 20, 30);
        Assert.assertEquals(TriangleType.ISOSCELES, type );
    }

    @Test
    public void testError(){
        Triangle triangle = new Triangle();
        TriangleType type = triangle.getTriangleType(-10, 20, 30);
        Assert.assertEquals(TriangleType.ERROR, type );
    }

}
